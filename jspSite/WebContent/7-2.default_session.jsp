<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         session="true"
         %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>기본객체[session(HttpSession)]</h1>
<hr/>
<ol>
	<li> &lt;%@ page session="true"%&gt; (HttpSession session=request.getSession();)</li>
	<li> &lt;%@ page session="false"%&gt;(session ref사용불가)</li>
</ol>
<% 
/*
     <<요청시 JESSIONID쿠키존재안할때>>
         1.JESSIONID 쿠키 존재여부 판단 후 JESSIONID 쿠키 존재하지 않으면
            세션아이디 발행 후 HttpSession 객체를 생성한 후 세션아이디를 설정 반환
         2.HttpSession 객체 사용  
         3.JESSIONID 이름의 session 쿠키 객체를 생성한 후 응답 객체에 추가 
     
      <<요청시 JESSIONID쿠키존재할때>> 
         1.JESSIONID 쿠키 존재여부 판단 후 JESSIONID 쿠키 존재하면
           	JSESSIONID 쿠키의 값(세션아이디)을 사용해서 서버에 존재하는
            HttpSession 객체 중에서 세션아이디의 값과 일치하는 HttpSession 객체 반환(세션바인딩) 
         2.HttpSession객체사용
*/            
%>
</body>
</html>
