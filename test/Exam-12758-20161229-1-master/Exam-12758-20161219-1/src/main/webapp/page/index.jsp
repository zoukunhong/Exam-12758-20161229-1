<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String path = request.getContextPath(); %>
<html>
<body>
<a href="<%=path%>/login.jsp">login</a>
<a href="<%=path%>/FilmServlet?choice=show">showFilm</a>
<a href="<%=path%>/PrepareServlet?languages=1&page=/page/add_film.jsp">add</a>
</body>
</html>
