<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EXHAUST SYSTEM TEST</title>
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
            NO ERRORS!

        </tr>
        </#list>
</table>
</body>
</html>