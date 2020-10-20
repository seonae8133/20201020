<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //자바 변수 선언 및 메소드 선언 <%!  
	String id;
	String pw;
	String msg;
	public void method(){};
	
%>

<%
//이부분에 자바 코드를 쓴다
	id=request.getParameter("id");
	pw=request.getParameter("pw");
	
	if(id.equals("hong"))
		msg = "웅앵웅님 환영합니다";
	else
		msg = "등록된 회원이 아닙니다"; 
%>
</body>
<div align="center">
<H1><%= msg %></H1>
</div>
</html>