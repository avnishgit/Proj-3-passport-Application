<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<form:form action="personSubmit" method="post"
		modelAttribute="personBean">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="fName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input type="email" path="email" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>Male<form:radiobutton path="gender" value="M" />
					Female<form:radiobutton path="gender" value="F" /></td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
			<td>Aadhar No.</td>
			<td><form:input type ="number" path="aadhar" legth="12" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Next" /></td>
			<td><input type="reset" value="Reset"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>