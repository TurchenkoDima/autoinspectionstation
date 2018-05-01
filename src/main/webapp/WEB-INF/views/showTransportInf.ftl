<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/resources/static/css/showTransportInf.css"/>
    <h1>REGISTERED CAR</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Owner</th>
            <th>Registration plate</th>
            <th>Model</th>
            <th>Year of manufacture</th>
            <th>Color</th>
            <th>Type</th>
            <th>Category</th>
            <th>Engine type</th>
            <th>Eco class</th>
            <th>Number of axles</th>
            <th>Brake system</th>
        </tr>
        <#list autoInf as auto>
        <tr>
            <td>${auto.id}</a></td>
            <td>${auto.owner}</td>
            <td>${auto.registrationPlate}</td>
            <td>${auto.model}</td>
            <td>${auto.yearOfManufacture}</td>
            <td>${auto.color}</td>
            <td>${auto.type}</td>
            <td>${auto.category}</td>
            <td>${auto.engineType}</td>
            <td>${auto.ecoClass}</td>
            <td>${auto.numberOfaxles}</td>
            <td>${auto.brakeSystem}</td>
        </tr>
        </#list>
    </table>
    <br>
    <a href="/app/techengineers"> BACK TO MENU! </a><br>
</body>
</html>