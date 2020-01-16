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
	<form:form action="passportSubmit" method="post"
		modelAttribute="passportBean">

		<h4><u>Person Details</u></h4>
		<table>
			<tr>
				<td>FirstName</td>
				<td><form:input path="fName" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>DateOfBirth</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:input path="gender" /></td>
			</tr>
			<tr>
				<td>AdhaarNo</td>
				<td><form:input path="aadhar" /></td>
			</tr>
		</table>
		<h4><u>Education details</u></h4>
		<table>
			<tr>
				<td>Highest Degree</td>
				<td><form:input path="qualifaction" /></td>
			</tr>
			<tr>
				<td>University</td>
				<td><form:input path="university" /></td>
			</tr>
			<tr>
				<td>Passed OutYear</td>
				<td><form:input path="year" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Confirm"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>