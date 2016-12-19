<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- page isELIgnored="true|false" 如果设定为真，那么JSP中的表达式被当成字符串处理 -->
<%@page isELIgnored="false"%>
<%
String path = request.getContextPath();
%>
<html>
<body>
<a href="<%=path%>/page/index.jsp">返回首页</a>
	<table>
		<tbody>
			<tr><th>film_id</th><th>title</th><th>description</th><th>language</th><th>operation</th></tr>
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.film_id}</td><td>${item.title}</td><td>${item.description}</td><td>${item.name}</td>
					<td>
						<a href="<%=path%>/FilmServlet?choice=showOne&film_id=${item.film_id}">修改</a>&nbsp;&nbsp;
						<a href="<%=path%>/FilmServlet?choice=delete&film_id=${item.film_id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
