<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직무 목록</title>
<script type="text/javascript" src="/Board2/js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$().ready(function(){
	$("#changeBtn").click(function(){
		$("#jobList").attr({
			"method":"post",
			"action":"./doChangeJob"
		}).submit();
	})
})
</script>
</head>
<body>
	<table>
	<tr>
	<th></th>
	<th>직무번호</th>
	<th>직무이름</th>
	</tr>
	<c:forEach var="job" items="${jobList }">
	<tr>
		<form id="jobList">	
			<td><input type="checkbox" name="checkBox" value="${job.jobId}"/></td>
			<td>${job.jobId}</td>
			<td>${job.jobName}</td>
	</tr>
	</c:forEach>
	</table>
	<input type="hidden" name="employeeId" value="${employeeId }"/> 
	<input type="button" id="changeBtn" value="직무변경"/>
	<input type="button" onclick="location.href='./employeeList'" value="사원목록"/>
		</form>
</body>
</html>