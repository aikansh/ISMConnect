<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.ismconnect.util.SignupConstants"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.google.appengine.api.users.User"%>
<%@ page import="com.google.appengine.api.users.UserService"%>
<%@ page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<spring:url value="/resources/core/css/main.css" var="coreCss" />
<link href="${coreCss}" rel="stylesheet" />
</head>
<body>
	<form action="signup" method="post">
		<h3>Welcome to ISM Connect.</h3>
		<input type="hidden" name="role" value="alumni">
		<h4>Signup:</h4>
		<h5>
			Full Name:<input type="text" name="<%=SignupConstants.FULL_NAME%>">
		</h5>
		<h5>
			Email:<input type="text" name="email">
		</h5>
		<h5>
			Phone:<input type="text" name="phone">
		</h5>
		<h5>
			Company:<input type="text" name="company">
		</h5>
		<h5>
			Location:<input type="text" name="location">
		</h5>
		<h5>
			Batch:<input type="text" name="batch">
		</h5>
		<h5>
			Department:<input type="text" name="department">
		</h5>
		<h5>
			Interests:<input type="text" name="interests">
		</h5>
		<h5>
			Past Companies:<input type="text" name="pastcompanies">
		</h5>
		<h5>
			LinkedIn Link:<input type="text" name="linkedinlink">
		</h5>
		<h5>
			Facebook Link:<input type="text" name="fblink">
		</h5>
		<input type="submit" value="Submit">
	</form>
</body>
</html>