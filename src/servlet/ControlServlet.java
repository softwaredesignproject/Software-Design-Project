
package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import controller.LogicController;
import user.UserData;

/**
 * @author Arthi
 *
 */
public class ControlServlet  extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		 ServletContext context= null;
         String url=null;
         RequestDispatcher rd = null;
        
         UserData userData = new UserData();
		 System.out.println("--ControlServlet--");
		 //Get all the user input parameters from JSP
		 userData.setStartaddress(request.getParameter("startaddress").toString());
		 userData.setEndaddress (request.getParameter("endaddress").toString());
		 userData.setRbtransport(request.getParameter("rbtransport").toString());
		 userData.setStartzipcode(request.getParameter("startzipcode"));
		 userData.setEndzipcode(request.getParameter("endzipcode"));
		 userData.setTimetype(request.getParameter("timetype"));
		 userData.setDate(request.getParameter("date"));
		 userData.setTime(request.getParameter("time"));
		 userData.setRbweather(request.getParameter("rbweather"));
		 userData.setRbsex(request.getParameter("rbsex"));
		 userData.setRbage(request.getParameter("rbage"));
		 userData.setRbgroupsize(request.getParameter("rbgroupsize"));
		 userData.setRbtemp(request.getParameter("rbtemp"));
		 
		 /*
		 Hashtable htUserInput = new Hashtable();
		 
		 htUserInput.put("startaddress", userData.getStartaddress());
		 htUserInput.put("endaddress", userData.getEndaddress());
		 htUserInput.put("endzipcode", userData.getEndzipcode());
		 htUserInput.put("timetype", userData.getTimetype());
		 htUserInput.put("date", userData.);
		 htUserInput.put("time", strTime);
		 htUserInput.put("rbweather", strWeather);
		 htUserInput.put("rbsex", strSex);
		 htUserInput.put("rbage", strAge);
		 htUserInput.put("rbgroupsize", strGroupSize);
		 htUserInput.put("rbtemp", strTempFormat);
		 htUserInput.put("rbtransport", userData.getRbtransport());
		 
		 
		 //Calling logic 
		 //Set the Hashtable to LogicControl
		 
		 logicCtrl.setHtAllUserInput(htUserInput);
		 */
		 //Call Action class - one result method - obtain the results in a ArrayList of Hashtables
		 
		 //Using distance and weather result - sort output or suggest alternative if possible
		 //Get result from LogicController
		 LogicController logicCtrl = new LogicController();
		 ArrayList alControllerResult = new ArrayList();
		 alControllerResult = logicCtrl.getAlFinalResult(userData);
		 
		 
		 
		 request.setAttribute("durationValue", alControllerResult.get(0));
		 request.setAttribute("distanceValue", alControllerResult.get(1));
		 request.setAttribute("steps", alControllerResult.get(2));	
		 request.setAttribute("weatherValue", alControllerResult.get(3));
		 
		 //Post results to JSP page		 
		 url= "/results.jsp";
         context = getServletContext();
         rd= context.getRequestDispatcher(url);
         rd.forward(request, response);
         
         /*
         //Print directly
		 response.setContentType("text/html");
		 	 	 
		 PrintWriter out = response.getWriter();
		 
		 //Write the HTML to the response
		 
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title> A very simple servlet example</title>");
		 out.println("</head>");
		 out.println("<body>");
		 
	     // get Enumeration of keys contained in Hashtable using
	     // Enumeration keys() method of Hashtable class
	    
	     Collection cUserInput = htUserInput.values();
		//iterate through the collection
		 Iterator itr = cUserInput.iterator();
		 while(itr.hasNext())
		 {
		 out.println("<h1>"+itr.next()+"</h1>");
		 }
		 out.println("<h1> ---"+userData.getRbtransport()+"</h1>");
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
		 */
	 }
	
}
