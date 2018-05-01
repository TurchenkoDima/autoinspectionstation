package com.courseproject.entity;

public class TechEngineer {

    private int id;
    private String name;
    private String surname;
    private String fathersName;
    private String login;
    private String password;

    public TechEngineer(){

    }

    public TechEngineer(int id, String name, String surname, String fathersName, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TechEngineer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersName='" + fathersName + '\'' +
                '}';
    }
}
