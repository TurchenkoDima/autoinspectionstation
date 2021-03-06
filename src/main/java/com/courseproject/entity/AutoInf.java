package com.courseproject.entity;

import com.courseproject.helpers.AutoCheckStatus;

public class AutoInf {

    private int id;
    private String owner;//Владелец
    private String registrationPlate;//регистрационный знак
    private String model;//модель
    private String yearOfManufacture;//год выпуска
    private String color;//цвет
    private String type;//тип
    private String category;//категория
    private String engineType;//тип двигателя
    private int ecoClass;//экологический класс
    private int numberOfaxles;//количество мостов
    private String brakeSystem;//тормозная система

    private AutoCheckStatus autoCheckStatus;



    public AutoInf(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEcoClass() {
        return ecoClass;
    }

    public void setEcoClass(int ecoClass) {
        this.ecoClass = ecoClass;
    }

    public int getNumberOfaxles() {
        return numberOfaxles;
    }

    public void setNumberOfaxles(int numberOfaxles) {
        this.numberOfaxles = numberOfaxles;
    }

    public String getBrakeSystem() {
        return brakeSystem;
    }

    public void setBrakeSystem(String brakeSystem) {
        this.brakeSystem = brakeSystem;
    }

    public AutoCheckStatus getAutoCheckStatus() {
        return autoCheckStatus;
    }
}
