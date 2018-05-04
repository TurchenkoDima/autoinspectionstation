<#ftl encoding="Windows-1251"/>
<!DOCTYPE html>
<html lang="ru" xmlns="http://www.w3.org/1999/html">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


    <title>Break System Test</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/resources/static/css/showTransportInf.css"/>
<table>
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
    <#--<#list errors as error>-->
    <#--<tr>-->
        <#--<p>${error}</p>-->
    <#--</tr>-->
    <#--<#else>-->
        <#--No ERRORS!-->
    <#--</#list>-->
</table>
</body>
</html>