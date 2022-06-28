<%@page contentType="text/html; charset=UTF-8"  %>
<%@include file="../header.html" %>

<p>ユーザー登録をしてください。</p>
<form action="insert" method="post">
    　名　前　 <input type="text" name="name">
    <br>
    パスワード <input type="text" name="password">
    <br>
    <br>
    <input type="submit" value="登録">
</form>

<%@include file="../footer.html" %>