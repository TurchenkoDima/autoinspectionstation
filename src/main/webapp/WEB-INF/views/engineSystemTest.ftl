<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<link rel="stylesheet" type="text/css" href="/resources/static/css/showTransportInf.css"/>
<table>
    <tr>
        <th>ERRORS LIST</th>
    </tr>
        <#list errors as err>
        <tr>
            <td>${err.error}</td>
        </tr>
        <#else>
        <tr>
            <th>NO ERRORS</th>

        </tr>
        </#list>
</table>
</body>
</html>