<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/resources/static/css/autorization.css"/>

    <head>
        <meta charset="utf-8">
        <title>Login</title>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
    </head>
    <div id="login">
        <form name="form-login", action="/app/" method="post">
            <span class="fontawesome-user"></span>
            <input type="text" id="user" name = login placeholder="Username">

            <span class="fontawesome-lock"></span>
            <input type="password" id=pass" name = "password" placeholder="Password">

            <input type="submit" value="Login">

        </form>
    </div>
</body>
</html>