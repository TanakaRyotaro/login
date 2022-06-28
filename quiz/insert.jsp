<%@page contentType="text/html; charset=UTF-8"  %>
<%@include file="../header.html" %>
<%@include file="../quiz/menu.jsp" %>

<p>ユーザー登録をしてください。</p>
<form action="insert" method="post">
    　名　前　 <input type="text" placeholder="20文字以内で入力して下さい" name="name">
    <br>
    パスワード <input type="text" placeholder="半角英数字8文字以上12文字以内で入力してください" name="password">
    <br>
    <br>
    <input type="submit" value="登録">
</form>

<%@include file="../footer.html" %>