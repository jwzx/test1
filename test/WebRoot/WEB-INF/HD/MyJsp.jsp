<%@page import="java.security.spec.MGF1ParameterSpec"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>

<!DOCTYPE HTML>
<html>
  <head>
    
    <title>My JSP 'MyJsp.jsp' starting page</title>

  </head>
  
  <body>
  	<p>页面的编码格式为utf-8</p>
  
    This is my JSP page. <br>
    
    <%
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
    	String s=sdf.format(new Date());
     %>
     <%="当前时间:"+s
     
      %>
      
      <%String str="今天是运动会!" %>
      <%=1+2 %>
      <%="须木一瓜:"+str %>
      <%String url='img/01.jsp' %>
      <img alt="" src="<%=url %>">
  </body>
</html>
