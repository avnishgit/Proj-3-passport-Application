<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Education Form</title>
</head>
<body>
	<form:form action="educationSubmit" method="post"
		modelAttribute="educationBean">
		<table>
		
			<tr>
			<form:hidden path="pid" />
				<td>Degree</td>
				<td><form:select path="qualifaction">
						<form:option value="-" label="--Please Select--" />
						<form:options items="${listDegree}" />
					</form:select></td>
			</tr>
			
			<tr>
				<td>University</td>
				<td><form:select path="university">
						<form:option value="-" label="--Please Select--" />
						<form:options items="${listUni}" />
					</form:select></td>
			</tr>
			
			<tr>
				<td>Pass Out Year</td>
				<td><form:select path="year">
						<form:option value="-" label="--Please Select--" />
						<form:options items="${listYear}" />
					</form:select></td>
			</tr>
			<tr>
			<td><input type="submit" value="Save & Next"/></td>
			<td><a href="/getPersonDataById?personId=${educationBean.pid}">Preview</a></td>
			</tr>
		</table>

	</form:form>
</body>
</html>