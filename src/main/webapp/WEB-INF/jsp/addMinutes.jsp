<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Minutes Page</title>

<script type="text/javascript" src="jquery-3.5.1.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$.getJSON(
				'http://localhost:8080/FitnessTracker/activities.json', {ajax:'true'},
				function(data){
					var html = '<option value="">--Please Select One -- </option>';
					var len = data.length;

					for (var i = 0; i < len; i++){
						html += '<option value="' + data[i].desc + '">' + 
						data[i].desc + '</option>';
						}

					//html += '</option>';
					$('#activities').html(html);
					
					}
				);
	});
</script>

</head>
<body>
	<h1>Add Minutes Exercised</h1>

	Language :
	<a href="?language=en"> English</a> |
	<a href="?language=es">Spanish</a> |
	<a href="?language=mr_IN">Marathi</a>

	<form:form commandName="minutesModel">
		<table>
			<tr>
				<td><spring:message code="goal.text" /></td>
				<td><form:input path="minutes" /></td>
				<!-- tied with object -->
				<td><form:select id="activities" path="activity"></form:select>
				</td>
			</tr>
			<tr>
				<td>Message</td>
				<td colspan="2"><form:input path="message" /></td>
				<!-- tied with object -->
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enter here" /></td>
			</tr>
		</table>
	</form:form>
	<h1>${goalModel.message}</h1>
</body>
</html>