<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../shopping/menu.jsp" %>

<form action="Login.action" method="post">
    <p>ログイン名<input type="text" name="login"></p>
    <p>パスワード<input type="text" name="password"></p>
    <input type="submit" value="ログイン">
</form>

<%@include file="../footer.html" %>