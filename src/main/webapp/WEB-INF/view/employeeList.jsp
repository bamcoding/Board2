<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>모든 직원</title>
<script type="text/javascript" src="/Board2/js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$().ready(function(){
	$("#deleteBtn").click(function(){
		$("#employeeList").attr({
			"method":"post",
			"action":"./doRemoveEmployee"
		}).submit();
	})
	$("#promotionBtn").click(function(){
		$("#employeeList").attr({
			"method":"post",
			"action":"./doPromotionEmployee"
		}).submit();
	})
	
})
</script>
</head>
<body>
	<table>
	<tr>
	<th></th>
	<th>사원번호</th>
	<th>이름</th>
	<th>직급</th>
	<th>직무</th>
	<th>연봉</th>
	<th>부서명</th>
	</tr>
	<c:forEach var="employee" items="${employeeList}">
	<tr>
	<form id="employeeList">
		<td><input type="checkbox" id="checkBox" name="checkBox" value="${employee.employeeId}"/></td>
		<td>${employee.employeeId}</td>
		<td>${employee.employeeName}</td>
		<td>${employee.position}</td>
		<td><a href="./jobList?employeeId=${employee.employeeId}">${employee.job}</a></td>
		<td>${employee.salary}</td>
		<td><a href="./departmentList?employeeId=${employee.employeeId}">${employee.departmentId}</a></td>		
	</tr>
	</c:forEach>
	</table>
	
	<input type="button" onclick="location.href='./addEmployee'" value="사원등록"/>
	<input type="button" id="deleteBtn" value="사원삭제"/>
	<input type="button" id="promotionBtn" value="사원진급"/>
	</form>
</body>

</html>