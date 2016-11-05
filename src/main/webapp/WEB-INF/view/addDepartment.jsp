<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>부서 등록</title>
</head>
<body>
	<form method="post" action="./doAddDepartment">
		<input type="hidden" name="departmentId" value="null"/>
		<input type="hidden" name="managerId" value="null"/>
		
		<label for="departmentName">이름 : </label>
		<input type="text" name="departmentName" id="departmentName"/><br/>
		<input type="submit" value="등록"/>
	</form>
</body>
</html>