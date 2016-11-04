<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>모든 직원</title>
</head>
<body>
	<table>
	<tr>
	<th>사번</th>
	<th>이름</th>
	<th>직급</th>
	<th>직무</th>
	<th>연봉</th>
	<th>부서명</th>
	</tr>
	<c:forEach var="employee" items="${employeeList}">
	<tr>
		<td>${employee.employeeId}</td>
		<td>${employee.employeeName}</td>
		<td>${employee.position}</td>
		<td>${employee.job}</td>
		<td>${employee.salary}</td>
		<td>${employee.departmentId}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>