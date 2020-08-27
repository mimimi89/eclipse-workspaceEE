<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
	GET,POST요청구분하기
*/
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("4.form.jsp");
	return;
}
%>

<%--
JSP주석
	1.파라메타받기
	2.Service메쏘드호출
	3.클라이언트응답
--%>
<!-- 
 HTML주석
    1.파라메타받기
	2.Service메쏘드호출
	3.클라이언트응답
 -->
 <%
 	request.setCharacterEncoding("UTF-8");
 	String id=request.getParameter("id");
 	String name=request.getParameter("name");
 	String pass=request.getParameter("pass");
 	String addr=request.getParameter("addr");
 	String[] hobbies=request.getParameterValues("hobby");
 	if(hobbies==null){
 		hobbies=new String[0];
 	}
 	String job=request.getParameter("job");
 	String gender=request.getParameter("gender");
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>가입결과</h1>
<ul>
	<li>아이디: <%=id %></li>
	<li>비밀번호: <%=pass %></li>
	<li>이름: <%=name %></li>
	<li>주소: <%=addr %></li>
	<li>성별: <%=gender %></li>
	<li>직업: <%=job %></li>
	<li>취미: 
	<%for(int i=0;i<hobbies.length;i++){ %>
		<li><%=hobbies[i]%></li>
	<%}%>
	</li>
</ul>
<br/>
<br/>
<br/>
<br/>
<br/>
<%@ include file="5-6.directive_included_file.jspf" %>
</body>
</html>













