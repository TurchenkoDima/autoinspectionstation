<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form name = "techEngineer", action="/app/updatetechengineer", method="post">
        <p>Id</p>
        <input title = "Id", type = "number" name = "id" value = "${techEngineer.id}">
        <p>Name</p>
        <input title = "Name", type = "text" name = "name" value = "${techEngineer.name}">
        <p>Surname</p>
        <input title = "Surname", type = "text" name = "surname" value = "${techEngineer.surname}">
        <p>Fathers Name</p>
        <input title = "FathersName", type = "text" name = "fathersName" value = "${techEngineer.fathersName}">
        <input type="submit" value="OK">
    </form>
</body>
</html>