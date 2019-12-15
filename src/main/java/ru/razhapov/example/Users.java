package ru.razhapov.example;

import java.util.ArrayList;
import java.util.List;

public class Users{
    private String name;
    private String number;
    private static long userId = 0;
    private long id = 0;
    public static List<Users> usersList = new ArrayList<Users>();

    public Users(String name, String number) {
        this.id = ++userId;
        this.name = name;
        this.number = number;
        usersList.add(this);

    }
    public void addUser(Users users){
        usersList.add(users);
    }
    public void showAllUsers() {
        for (Users user : Users.usersList) {
            System.out.println(user);
        }
    }

    public static void addContactList(String name, String number){
        Contacts.addContactMyPhoneBook(name,number);
    }

    @Override
    public String toString() {
        return "name: " + this.name
                + " number: " + this.number
                + " id: " + this.id
                + " Телефонный справочник: " + Contacts.contactsList;
    }

    public long getId() {
        return this.id;
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
