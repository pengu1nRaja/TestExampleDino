package ru.razhapov.example;

public class Main {
    public static void main(String[] args){
        Users users1 = new Users("alex", "489328573892");
        Users users2 = new Users("oleg", "435435345");
        Users users3 = new Users("santa", "5435345");
        System.out.println(users1.toString());
        System.out.println(users3.toString());
        System.out.println(users2.toString());
    }
}
