<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
  function bindBtnClick(){
	  
      alert(11);
	   $("#btnSearch").click(function(){
		    $.get("/test/testRestJosn/1",{},function(data){
    	    	
 	    	   alert(JSON.stringify(data));
 	    	
 	    },"json");
		     
		   
	   });
  }
         $(function(){
        	     
        	 bindBtnClick();
         });
</script>
</head>
<body>
	<h2>
	
	<a href="#"><%=basePath%></a>
	      
	      
	        <c:forEach items="${str} " var="t" >
	        
	            ${t }
	        </c:forEach>
	      
	      
      <input   type="button" value="查询" id="btnSearch"/>
	 </h2>
</body>
</html>