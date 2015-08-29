<%@page import="com.ismconnect.dal.repo.UserRepository"%>
<%@page import="com.ismconnect.dal.data.UserDetail"%>
<%@page import="com.ismconnect.dal.repo.UserRepositoryImpl"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<spring:url value="/resources/core/css/main.css" var="coreCss" />
<link href="${coreCss}" rel="stylesheet" />
<spring:url value="/webjars/bootstrap/3.2.0/css/bootstrap.min.css"
	var="bootstrapCss" />
<link rel="stylesheet" href="${bootstrapCss}">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ISM Connect</title>

<!-- CSS -->
<spring:url
	value="/resources/core/font-awesome/css/font-awesome.min.css"
	var="fontCss" />
<spring:url value="/resources/core/css/form-elements.css"
	var="formElementsCss" />
<spring:url value="/resources/core/css/style.css" var="styleCss" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="${fontCss}">
<link rel="stylesheet" href="${formElementsCss}">
<link rel="stylesheet" href="${styleCss}">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="/resources/core/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="/resources/core/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="/resources/core/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="/resources/core/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="/resources/core/ico/apple-touch-icon-57-precomposed.png">

</head>
<body>

	<!-- Top content -->
	<p></p>
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Welcome to ISM Connect</strong>
						</h1>
						<div class="description">
							<p>This is a portal for students to learn from alumni and for
								alumni to share their knowledge in their respective domains.</p>
						</div>
					</div>
				</div>
				<div class="row">
					<p>Thanks! You have successfully signed up.</p>
					<br /> <a href="/login">Please login...</a>

				</div>
			</div>
		</div>

	</div>
	<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>

	<script type="text/javascript"
		src="/resources/core/js/jquery.backstretch.min.js"></script>

	<script type="text/javascript"
		src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/resources/core/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="/resources/core/js/placeholder.js"></script>
        <![endif]-->
</body>
</html>