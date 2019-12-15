package ru.razhapov.example;

public class Main {
    public static void main(String[] args) {
        Users.addUser("alex", "489328573892");
        Users.addUser("oleg", "435435345");
        Users.addUser("santa", "5435345");

        Users.usersList.get(0).addContactList("valera", "789676756");
        Users.usersList.get(2).addContactList("larisa", "07807");
        Users.addUser("ivan", "4325423432");
        Users.addUser("", "-2");
        Users.addUser("532552", "bfwljefkew");
        Users.addUser("frodo", "bfwljefkew");
        Users.showAllUsers();

    }
}