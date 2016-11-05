<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>모든 부서</title>
<script type="text/javascript" src="/Board2/js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$().ready(function(){
	$("#deleteBtn").click(function(){
		$("#departmentList").attr({
			"method":"post",
			"action":"./doRemoveDepartment"
		}).submit();
	})
	$("#changeBtn").click(function(){
		$("#departmentList").attr({
			"method":"post",
			"action":"./doChangeDepartment"
		}).submit();
	})
})
</script>
</head>
<body>
	<table>
	<tr>
	<th></th>
	<th>부서번호</th>
	<th>부서이름</th>
	<th>부서장</th>
	</tr>
	<c:forEach var="department" items="${departmentList}">
	<tr>
		<form id="departmentList">	
			<td><input type="checkbox" name="checkBox" value="${department.departmentId}"/></td>
			<td>${department.departmentId}</td>
			<td>${department.departmentName}</td>
			<td>${department.managerId}</td>
	</tr>
	</c:forEach>
	</table>
	<input type="hidden" name="employeeId" value="${employeeId }"/> 
	<input type="button" onclick="location.href='./addDepartment'" value="부서등록"/>
	<input type="button" id="deleteBtn" value="부서삭제"/>
	<input type="button" id="changeBtn" value="부서변경"/>
	<input type="button" onclick="location.href='./employeeList'" value="사원목록"/>
		</form>
</body>
</html>