<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>

<%
	int count=0;
	Integer countInt=(Integer)session.getAttribute("count");
	if(countInt==null/*최초요청이면*/){
		count=0;
		
	}else{
		count=countInt.intValue();
		
	}
	count++;
	session.setAttribute("count", new Integer(count));
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HttpSession객체를 사용한 클라이언트별(브라우저별) 요청횟수 카운트</h1>
	<hr/>
	<h3><%=session.getId()%>님 <%=count %>번째 요청입니다.</h3>
	<br/>
	<ol>
		<li>session객체 생성여부: <%=session.isNew() %></li>
		<li>session객체 참조변수: <%=session %></li>
		<li>session객체 id: <%=session.getId() %></li>
		<li>session객체 생성시간: <%=session.getCreationTime() %></li>
		<li>session객체 유효시간: (마지막바인딩시간으로부터)<%=session.getMaxInactiveInterval() %>초</li>
		<li>session객체 마지막바인딩시간: <%=session.getLastAccessedTime() %></li>
	</ol>
</body>
</html>