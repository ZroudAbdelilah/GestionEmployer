<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Log in</title>
</head>
<body>
<h1><%= "log in" %>
</h1>
<br/>


<form action="servlet1" method="post">
    Name:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="userpass"/><br/><br/>
    <input type="submit" value="login"/>
</form>
</body>
</html>