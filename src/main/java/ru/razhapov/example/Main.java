package ru.razhapov.example;

public class Main {
    public static void main(String[] args) {
        Users.addUser("alex", "489328573892");
        Users.addUser("oleg", "435435345");
        Users.addUser("santa", "5435345");

        Users.usersList.get(0).addContactList("valera", "789676756");
        Users.usersList.get(0).addContactList("misha", "32792");
        Users.usersList.get(0).addContactList("aelita", "37252385");
        Users.usersList.get(2).addContactList("larisa", "07807");
        Users.addUser("ivan", "4325423432");
        Users.addUser("", "-2");
        Users.addUser("532552", "bfwljefkew");
        Users.addUser("frodo", "bfwljefkew");
        Users.removeUser("oleg");

        Users.usersList.get(0).findContact("32792");
        Users.findUser("santa");

        Users.usersList.get(1).editUser("feofan", "123");
        System.out.println(Users.userGetId(3));
        System.out.println(Users.usersList.get(1).contactsGetId(1));
        Users.showAllUsers();
    }
}