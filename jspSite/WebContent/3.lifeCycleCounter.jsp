<%@ page contentType="text/html; charset=UTF-8" %>
<%!
	private int count=0;
	public void jspInit(){
		System.out.println(
				"1.jspInit(): 객체 생성 시 단 한 번 호출되는 메쏘드[객체초기화, 리스소획득]");
	}
	public void jspDestroy(){
		System.out.println(
				"3.jspDestroy(): servlet 객체가 메모리에서 해지 시 호출[리소스반환]");
	}
%>

<%
	System.out.println(
			"2.jspServlet() 호출: 요청 시마다 호출");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
			<body bgcolor=#40e0d0 style=font-size:9pt;line-height:140%;> 
			<center>			
			 현재까지의 접속자수
			<font color=#0000FF>
			 <%= ++count %>
			</font>
			 명입니다 
			</center>


</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
</br>
<%@ include file="5-6.directive_included_file.jspf" %> 
			</body> 
</html> 
