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
ArrayList arFinalResults = (ArrayList)request.getAttribute("resultarraylist");
%>
</head>
<body>
<h1>MIS 507: Trip Planner System - Results</h1>
<p>Values from ControlServlet </p>
<% 
for(int i=0;i< arFinalResults.size();i++)
	System.out.println(arFinalResults.get(i).toString());%>

<%      for(int i = 0; i<arFinalResults.size(); ++i)
			         {
			           out.write("<p>"+arFinalResults.get(i).toString()+"<p>");
			         }
			    %>

</body>
</html>