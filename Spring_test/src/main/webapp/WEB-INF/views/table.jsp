<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, td, th
{
border:5px solid green;
}
th
{
background-color:green;
color:white;
}
</style>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<th>Header 1</th>
<th>Header 2</th>
</tr>
<tr>
<td>row 1, cell 1</td>
<td>row 1, cell 2</td>
</tr>
<tr>
<td>row 2, cell 1</td>
<td>row 2, cell 2</td>
</tr>
</table>
<br>
<br/>

${string} ${value} 
<br>
<br/>
<table border="1">
<tr>
<c:forEach items="${stringarray}" var="element"> 
    <td>${element} </td>
</c:forEach>
<tr/>
<tr>
<c:forEach items="${stringarray}" var="element"> 
    <td>${element} </td>
</c:forEach>
</tr>
</table>
<br>
<br/>
<form action="add" method="get">
	<input type="text" name="ii1" id="ii1" class="ii1" />
	<input type="text" name="ii2" id="ii2" class="ii2" />
	<input type="text" name="ii3" id="ii3" class="ii3" />
	<input type="submit" value="ADD" />
</form>
The result is ${rslt} 
</body>
</html>