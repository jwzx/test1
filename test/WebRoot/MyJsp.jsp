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
       <%String str="今天是运动会!"; %>
      <%=1+2 %>
      <%="须木一瓜:"+str %>
      <%String url="img/01.jsp"; %>
      <img alt="" src="<%=url %>">
      
      <%!
      		int number;
      		String s="赵丽颖";
      		int count( ){
      			number++;
      			return number;
      		}
       %>
       <%="number:"+count() %>;<br><br>
       
       <%!
       	String printMul(){
       		String s="";
       		for(int i=1;i<=9;i++){
       			for(int j=1;j<=i;j++){
       				s+=j+'X'+i+"="+i*j;
       				s+="&nbsp;&nbsp;";
       			}
       			s+="<br />";
       		}
       		return s;
       	}
       	void printMul(JspWriter out)throws Exception{
       		for(int i=1;i<=9;i++){
       			for(int j=1;j<=i;j++){
       				out.print(j+"X"+i+"="+i*j+"&nbsp;&nbsp;");
       			}
       			out.print("<br/>");
       		}
       	}
        %>
        
        
        <%@ include file="index.jsp" %>
        <br>
        <br>
		        
  </body>
</html>
