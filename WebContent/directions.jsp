<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MIS 507: Route Planner</title>

<script language="javascript">
</script>
</head>
<body>
<form name="frmAddress"  ACTION="ControlServlet"  METHOD="POST">
<h1>MIS 507: Route Planner - UserInput</h1>
<table>
			<tr>
				<td>Start Address:</td>
				<td><input type="text" name="startaddress" /></td>
			</tr>
			<tr>
				<td>Start Zipcode:</td>
				<td><input type="text" name="startzipcode"/></td>

			</tr>
			<tr>
				<td>End Address:</td>
				<td><input type="text" name="endaddress"/></td>

			</tr>
			<tr>
				<td>End Zipcode:</td>
				<td><input type="text" name="endzipcode"/></td>

			</tr>
			
						
			
			<tr>
				<td>
				Use Weather in Calculation?
				</td>
				<td>
				<input name="rbweather" type="radio" value="yes" checked="checked"/> Yes
				<input name="rbweather" type="radio" value="no" /> No
				
				</td>
			</tr>
			<tr>
				<td>Sex</td>
				<td><input name="rbsex" type="radio" value="na"
					checked="checked" /> N/A <input name="rbsex" type="radio"
					value="male" /> Male <input name="rbsex" type="radio"
					value="female" /> Female</td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input name="rbage" type="radio" value="na"
					checked="checked" /> N/A <input name="rbage" type="radio"
					value="young" /> Young <input name="rbage" type="radio"
					value="old" /> Old </td>
			</tr>
			<tr>
				<td>Group Size</td>
				<td><input name="rbgroupsize" type="radio" value="na"
					checked="checked" /> N/A <input name="rbgroupsize" type="radio"
					value="alone" /> Alone <input name="rbgroupsize" type="radio"
					value="withothers" /> With Others </td>
			</tr>
			
			<tr>
				<td>Temperature format</td>
				<td><input name="rbtemp" type="radio" value="C"
					checked="checked" /> C <input name="rbtemp" type="radio"
					value="F" /> F 
			</tr>
			
			<tr>
				<td>Mode of transport</td>
				<td><input name="rbtransport" type="radio" value="walk"
					checked="checked" /> Walk <input name="rbtransport" type="radio"
					value="bicycling" /> Bicycling 
			</tr>
			
			<tr>
				<td>
					<INPUT TYPE="SUBMIT" VALUE="Get Directions">
			</tr>
		</table>
</form>
</body>
</html>