<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homePage</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" /> 
</head>
<body>
	<div class="container">
		<h1>Grades</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Type</th><th>Score</th><th>Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="grades" items="${grade}">
				<tr>
					<td><a href="/grade/detail?id=${grades.id}">${grades.name}</a></td>
					<td>${grades.type}</td>
					<td>${grades.score}</td>
					<td>${grades.total}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="grades" class="btn btn-secondary">Add grade</a>
	</div>
</body>
</html>