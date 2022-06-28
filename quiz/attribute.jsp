<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page import="bean.User" %>

<% User u=(User)request.getAttribute("user"); %>

<%=u.getUserid() %>:<%=u.getName() %><br>

<%@include file="../footer.html" %>