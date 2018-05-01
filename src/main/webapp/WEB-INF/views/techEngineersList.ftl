<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>techEngineersList</h1>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>surname</th>
            <th>fathersName</th>
        </tr>
         <#list techEngineers as engineer>
         <tr>
             <td><a href="/app/techengineer/${engineer.id}">${engineer.id}</a></td>
             <td>${engineer.name}</td>
             <td>${engineer.surname}</td>
             <td>${engineer.fathersName}</td>
             <td><a href="/app/delete/${engineer.id}">DELETE</a></td>
             <td><a href="/app/update/${engineer.id}">UPDATE</a></td>
         </tr>
         </#list>
    </table>
    <br>
    <a href="/app/addtechengineer"> ADD NEW TECH ENGINEER! </a><br>
    <a href="/app/addAutoInf"> Add new auto </a><br>
</body>
</html>