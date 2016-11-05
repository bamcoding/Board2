<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원 등록</title>
</head>
<body>
	<form method="post" action="./doAddEmployee">
		<input type="hidden" name="employeeId" value="null"/>
		<label for="employeeName">이름 : </label>
		<input type="text" name="employeeName" id="employeeName"/><br/>
		<label for="position">직급 : </label>
		<input type="text" name="position" id="position"/><br/>
		<label for="job">직무 : </label>
		<input type="text" name="job" id="job"/><br/>
		<label for="salary">연봉 : </label>
		<input type="text" name="salary" id="salary"/><br/>
		<label for="departmentId">부서명 : </label>
		<input type="text" name="departmentId" id="departmentId"/><br/>
		<input type="submit" value="등록"/>
	</form>
</body>
</html>