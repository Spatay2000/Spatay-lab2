<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login Page </title>
</head>
<body>
<form action="login" method="post">
    <table style="background-color: brown; margin-left: 40px;" >
    <tr>
        <td>
            <h3> Login </h3>
        </td>
    </tr>

        <tr> <td> Username:</td><td> <input type=" text" name="login"> </td> </tr>
        <tr> <td> Password:</td><td> <input type="password" name="password"> </td> </tr>
        <tr> <td> <button type="submit" value="login">Log in</button> </td> <td> <a href="register.jsp">Registration </a> </td></tr>
    </table>
</form>
</body>
</html>
