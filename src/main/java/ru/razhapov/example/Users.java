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

    // добавление пользователя(не контакт)
    public static void addUser(String name, String number){
        try {
            if(!name.isEmpty() && !checkString(name)){
                if (!number.isEmpty() && Long.parseLong(number) > 0 && checkString(number)) {
                    usersList.add(new Users(name, number));
                    System.out.println("Пользователь " + name + " добавлен!");
                }else{ }
            }else {
                System.out.println("Некорректно введено имя: " + name);
            }
        } catch (Exception e){
            System.out.println("Некорректно введен номер: " + number);
        }
    }

    // показать всех пользователей(не контактов)
    public static void showAllUsers() {
        System.out.println("Список всех пользователей: ");
        for (Users user : Users.usersList) {
            System.out.println(user);
        }
    }

    // удаление пользователя(не контакта)
    public static void removeUser(String name){
        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getName().equals(name)){

                usersList.remove(i);
                System.out.println("Пользователь " + name + " удалён");
            }
        }
    }

    // добавление контакта в телефонную книгу пользователя
    public void addContactList(String name, String number){
        System.out.println("Добавляем контакт " + name + " в телефонную книгу пользователя " + this.getName());
        userPhoneBook.add(new Contacts(name, number));
    }

    //поиск контакта в телефонной книге пользователя
    public void findContact(String name){
        List<Contacts> list = new ArrayList<Contacts>();
        int count = 0;
        System.out.println("Поиск контакта: " + name + " в телефонной книге пользователя " + this.getName());
        for (int i = 0; i < this.userPhoneBook.size(); i++) {
            if(this.userPhoneBook.get(i).getName().equals(name)){
                list.add(userPhoneBook.get(i));
                count++;
            }
            else{
            }
        }
        if(count > 0) {
            System.out.println("Результатов поиска: " + count + "\n" + list);
        }
        else{
            System.out.println("Нет такого контакта: " + name + " в телефонной книге пользователя " + this.getName());
        }
        for (int i = list.size()-1; i >= 0; i--) {
            list.remove(i);
        }
        count = 0;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name
                + " Номер: " + this.number
                + " id: " + this.id
                + " Телефонный справочник: " + userPhoneBook;
    }


    // setters and getters

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
