package ru.razhapov.example;

public class Main {
    public static void main(String[] args) {
        Users users1 = new Users("alex", "489328573892");
        Users users2 = new Users("oleg", "435435345");
        Users users3 = new Users("santa", "5435345");
        
        users1.addContactList("valera", "789676756");
        users2.addContactList("larisa", "07807");
        users1.showAllUsers();
    }
}