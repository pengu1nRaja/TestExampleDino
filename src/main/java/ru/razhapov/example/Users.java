package ru.razhapov.example;

import java.util.ArrayList;
import java.util.List;

public class Users{
    private String name;
    private String number;
    private long userId;
    private List<Users> usersList = new ArrayList<Users>();

    public Users(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public void add(Users users){
        usersList.add(users);
    }

    @Override
    public String toString() {
        return "name: " + this.name + " number: " + this.number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
