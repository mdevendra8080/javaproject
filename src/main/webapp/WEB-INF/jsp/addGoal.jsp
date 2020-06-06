<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Goal</title>

<style type="text/css">
.error {
	color:#ff0000;
}

.errorblock{
color:#000;
background-color:#ffEEEE;
boarder : 3px solid #ff0000;
padding: 8px;
margin:16px;
 

}
</style>
</head>
<body>
<form:form commandName="goalModel" action="updateGoal.html">
	<form:errors path="*" cssClass="errorblock" element="div"/>
	<table>
		<tr>
			<td>
				Enter minutes
			</td>
			<td>
			<form:input path="minutes"/>
			
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<form:input path="message"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Enter Goal"/>
			</td>
		</tr>
		<tr></tr>
	</table>
</form:form>
</body>
</html>