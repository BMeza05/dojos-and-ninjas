<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html> 

<html>
<head>
<meta charset="ISO-8859-1">	
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<p>
			First name:
			<form:errors path="firstname" />
			<form:input path="firstname" />
		 </p>
		 <p>
		 	Last name:
		 	<form:errors path="lastname"/>
		 	<form:input path="lastname"/>
		 </p>
		 	Age:
		 	<form:errors path="age"/>
		 	<form:input path="age"/>
		 </p>
		 <p>
		 	<form:label path="dojo">Choose your dojo</form:label>
		 	<form:erros path="dojo"/>
		 	<form:select path="dojo">
		 		<option value ="" disabled selected>
		 		<c:forEach items="${dojos}" var="dojos">
		 			<form:option value="${dojos.id}">
		 			"${dojos.name}"
		 			</form:option>
		 		</c:forEach>
		 	</form:select>
		 </p>
		 
		
		 <input type = "submit" value="create Ninja" />
	</form:form>
	
</body>
</html>