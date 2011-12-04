<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MIS 507: Trip Planner System - Results</title>
<script language="javascript">

</script>
<%
ArrayList arFinalResults = (ArrayList)request.getAttribute("steps");
String[] strDuration = (String[])request.getAttribute("durationValue");
String[] strDistance = (String[])request.getAttribute("distanceValue");
String strWeather = (String)request.getAttribute("weatherValue");
%>
</head>
<body>
<h1>MIS 507: Trip Planner System - Results</h1>

<% 
for(int i=0;i< arFinalResults.size();i++)
	System.out.println(arFinalResults.get(i).toString());%>

<%     
out.write("<p><h2>"+"Weather: "+strWeather+"</h2></p><br>");
	%>
<%      for(int i = 0; i<arFinalResults.size(); ++i)
	{ 
	out.write("<p><h2>"+"Route: "+i+"</h2></p>");
	out.write("<p><h3>"+"Duration: "+strDuration[i]+"</h3></p>");
	out.write("<p><h3>"+"Distance: "+strDistance[i]+"</h3></p>");
	out.write("<p><h3>"+"Steps: "+"</h3></p>");
	String[] tempSteps = (String[]) arFinalResults.get(i);
	for(int j = 0; j<tempSteps.length; ++j)
			           out.write("<p>"+ tempSteps[j]+"</p>");
			         }
			    %>
			    
			    

</body>
</html>