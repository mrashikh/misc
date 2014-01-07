<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
page 2222222222

${myname}${myarray}

<br />

<c:forEach items="${myarray}" var="eachElement"> 
    <c:out value="${eachElement}"/> 
</c:forEach>



<form action="calculate" method="get">
	<input type="text" name="i1" id="i1" class="i1" />
	<input type="text" name="i2" id="i2" class="i2" />
	<input type="submit" value="Submit" />
</form>

Your result is ${result}
</body>
</html>