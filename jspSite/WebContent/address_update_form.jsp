<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>[김경호님 주소록 수정폼]</h1><hr>
<hr>
	<div>
		<a href='address_list.jsp'>[주소록리스트]</a>
	</div>
	<form method="post" action="address_update_action.jsp">
		아이디--<input type="text" name="id" value="guard"><br> 
		이름----<input type="text" name="name" value="김경호"><br> 
		전화번호<input type="text" name="phone" value="123-4568"><br> 
		주소----<input type="text" name="address" value="경기도 성남시"><br> 
		<input type="submit" value="주소록수정">
		<input type="reset" value="주소록수정폼지우기">
	</form>
</body>
</html>