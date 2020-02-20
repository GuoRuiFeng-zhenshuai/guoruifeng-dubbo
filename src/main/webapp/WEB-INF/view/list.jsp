<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap -->
<link rel="stylesheet" type="text/css"
	href="/resource/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/resource/css/cms.css" />
<link rel="stylesheet"  type="text/css"  href="/resource/css/jquery/screen.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>
<form action="list">
<input name="s1" type="date">
<input name="s2" type="date">
<select name="tiaojian">
	<option value="created">时间查询</option>
	<option value="commentCnt">评论数量</option>
</select>
<button>查询</button>


</form>
<body>
	
		<table>
			<tr>
				<td></td>
				<td>ID</td>
				<td>标题</td>
				<td>内容</td>
				<td>发表时间</td>
				<td>评论数量</td>
				
			</tr>
			<c:forEach items="${list }" var="l">
			<tr>
			<td>${l.id }</td>
			<td>${l.title }</td>
			<td>${l.content }</td>
			<td>${l.created }</td>
			<td>${l.commentCnt }</td>
			</tr>
			</c:forEach>
		</table>
		
	
	
</body>
</html>