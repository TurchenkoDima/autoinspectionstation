<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/resources/static/css/showTestCar.css"/>
    <script src="/resources/static/js/carousel.js"></script>

    <div id="carousel">
        <figure id="spinner">
            <img src="/resources/static/img/brakeSystem.jpg" alt>
            <img src="/resources/static/img/engine.jpg" alt>
            <img src="/resources/static/img/Exhaust.jpg" alt>
            <img src="/resources/static/img/Headlamps.jpg" alt>
            <img src="/resources/static/img/rudder.jpg" alt>
        </figure>
    </div>

    <span style="float:left" class="ss-icon" onclick="galleryspin('-')">&lt;</span>
    <span style="float:right" class="ss-icon" onclick="galleryspin('')">&gt;</span>


    <div id = "wrap">
        <p class = "textStyle">
            TECHNICAL OVERVIEW OF CHOSEN CAR!
        </p>
            <div class ="span1">
                <dl>
                    <dt class = "stat">
                        Owner
                    </dt>
                    <dd class = "number">
                        ${auto.owner}
                    </dd>
                </dl>
            </div>
            <div class ="span2">
                <dl>
                    <dt class = "stat">
                        Registration Plate
                    </dt>
                    <dd class = "number">
                        ${auto.registrationPlate}
                    </dd>
                </dl>
            </div>
            <div class ="span3">
                <dl>
                    <dt class = "stat">
                        Model
                    </dt>
                    <dd class = "number">
                        ${auto.model}
                    </dd>
                </dl>
            </div>
        <div class ="span4">
            <dl>
                <dt class = "stat">
                    Year
                </dt>
                <dd class = "number">
                ${auto.yearOfManufacture}
                </dd>
            </dl>
        </div>
        <div class ="span5">
            <dl>
                <dt class = "stat">
                    Color
                </dt>
                <dd class = "number">
                ${auto.color}
                </dd>
            </dl>
        </div>
        <div class ="span6">
            <dl>
                <dt class = "stat">
                    Type
                </dt>
                <dd class = "number">
                ${auto.type}
                </dd>
            </dl>
        </div>
        <div class ="span7">
            <dl>
                <dt class = "stat">
                    Category
                </dt>
                <dd class = "number">
                ${auto.category}
                </dd>
            </dl>
        </div>
        <div class ="span8">
            <dl>
                <dt class = "stat">
                    Eco class
                </dt>
                <dd class = "number">
                ${auto.ecoClass}
                </dd>
            </dl>
        </div>
        <div class ="span9">
            <dl>
                <dt class = "stat">
                    Engine type
                </dt>
                <dd class = "number">
                ${auto.engineType}
                </dd>
            </dl>
        </div>
    </div>

    <table  class="table_blur">
        <tr>
            <th>ID</th>
            <td>${auto.id}</td>
        </tr>
        <tr>
            <th>Owner</th>
            <td>${auto.owner}</td>
        </tr>
        <tr>
            <th>Registration plate</th>
            <td>${auto.registrationPlate}</td>
        </tr>
        <tr>
            <th>Model</th>
            <td>${auto.model}</td>
        </tr>
        <tr>
            <th>Year of manufacture</th>
            <td>${auto.yearOfManufacture}</td>
        </tr>
        <tr>
            <th>Color</th>
            <td>${auto.color}</td>
        </tr>
        <tr>
            <th>Type</th>
            <td>${auto.type}</td>
        </tr>
        <tr>
            <th>Category</th>
            <td>${auto.category}</td>
        </tr>
        <tr>
            <th>Engine type</th>
            <td>${auto.engineType}</td>
        </tr>
        <tr>
            <th>Eco class</th>
            <td>${auto.ecoClass}</td>
        </tr>
        <tr>
            <th>Number of axles</th>
            <td>${auto.numberOfaxles}</td>
        </tr>
        <tr>
            <th>Brake system</th>
            <td>${auto.brakeSystem}</td>
        </tr>
    </table>
</body>
</html>