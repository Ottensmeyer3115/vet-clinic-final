<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored ="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ANIMALS</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
	 crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class ="jumbotron jumbotraon-fluid">
			<div class ="container">
				<h1 class ="display-4"> Animal List</h1>
					<p class = "lead"> The information for all the animals is below:</p>
			</div>
		</div>
		<c:forEach var="animal" items ="${allAnimals}">
		<p><c:out value ="${ animal.name }"/> </p>
		</c:forEach>
	</div>
</body>
</html>