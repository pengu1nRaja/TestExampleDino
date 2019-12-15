package ru.razhapov.example;

import java.util.ArrayList;
import java.util.List;

public class Users{
    private String name;
    private String number;
    private static long userId = 0;
    private long id = 0;
    public static List<Users> usersList = new ArrayList<Users>();
    public List<Contacts> userPhoneBook = new ArrayList<Contacts>();

    public Users(String name, String number) {
        this.id = ++userId;
        this.name = name;
        this.number = number;
    }

    public static boolean checkString(String string) {
        try {
            Long.parseLong(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public static void addUser(String name, String number){
        try {
            if(!name.isEmpty() && !checkString(name)){
                if (!number.isEmpty() && Long.parseLong(number) > 0 && checkString(number)) {
                    usersList.add(new Users(name, number));
                }
            }
        } catch (Exception e){

        }
    }

    public static void showAllUsers() {

        for (Users user : Users.usersList) {
            System.out.println(user);
        }
    }
//    public static void removeUser(String name){
//
//        for (Users element : usersList) {
//            if(element.equals(name)){
//                usersList.remove();
//            }
//        }
//    }

    public void addContactList(String name, String number){
        userPhoneBook.add(new Contacts(name, number));
    }




    @Override
    public String toString() {
        return "name: " + this.name
                + " number: " + this.number
                + " id: " + this.id
                + " Телефонный справочник: " + userPhoneBook;
    }


    // setters and getters, not work lombok ._.

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
