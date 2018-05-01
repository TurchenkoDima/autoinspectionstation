<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/resources/static/css/transportInf.css"/>
    <h1>CAR REGISTRATION FORM:</h1>
    <form class="transportReg_form" action="/app/addtransportinf" method="post" name="autoInf">
        <ul>
            <li>
                <span class="required_notification">* Denotes Required Field</span>
            </li>
            <li>
                <h2>Enter common information</h2>
            </li>
            <li>
                <label for="owner"> Owner of Car: </label>
                <input type="text" name="owner" placeholder="Daniel Redkliff"/>
            </li>
            <li>
                <label for="registrationPlate"> Registration plate: </label>
                <input type="text" name="registrationPlate" placeholder="1234 AB-7"/>
            </li>
            <li>
                <label for="model"> Model: </label>
                <input type="text" name="model" placeholder="WOLKSWAGEN GOLF"/>
            </li>
            <li>
                <label for="yearOfManufacture"> Year of manufacture: </label>
                <input type="text" name="yearOfManufacture" placeholder="1986"/>
            </li>
            <li>
                <label for="color"> Color: </label>
                <input type="text" name="color" placeholder="white"/>
            </li>
            <li>
                <label for="type">Vehicle type: </label>
                <select id="type" name = "type">
                    <option value="Passenger">Passenger</option>
                    <option value="Minibus">Minibus</option>
                    <option value="Moped">Moped</option>
                    <option value="Motocross">Motocross</option>
                    <option value="Scooter">Scooter</option>
                </select>
            </li>
            <li>
                <label for="category">Vehicle category: </label>
                <select id="category" name = "category">
                    <option value="A">A</option>
                    <option value="A1">A1</option>
                    <option value="B">B</option>
                    <option value="B1">B1</option>
                    <option value="C">C</option>
                    <option value="C1">C1</option>
                </select>
            </li>
            <li>
                <h2>Enter technical information</h2>
            </li>
            <li>
                <label for="engineType">Engine type: </label>
                <select id="engineType" name = "engineType">
                    <option value="Diesel">Diesel</option>
                    <option value="Gasoline">Gasoline</option>
                    <option value="Gas">Gas</option>
                    <option value="Hybrid">Hybrid</option>
                    <option value="Natural compressed gas">Natural compressed gas</option>
                </select>
            </li>
            <li>
                <label for="ecoClass">Eco-Class: </label>
                <select id="ecoClass" name = "ecoClass">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </li>
            <li>
                <label for="numberOfaxles">Number of vehicle axles: </label>
                <select id="numberOfaxles" name = "numberOfaxles">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </li>
            <li>
                <label for="brakeSystem">Brake system: </label>
                <select id="brakeSystem" name = "brakeSystem">
                    <option value="Mechanical">Mechanical</option>
                    <option value="Pneumatic">Pneumatic</option>
                    <option value="Hydraulic">Hydraulic</option>
                    <option value="Combined">Combined</option>
                </select>
            </li>
            <li>
                <button class="submit" type="submit">Submit Form</button>
            </li>
        </ul>
    </form>
</body>
</html>