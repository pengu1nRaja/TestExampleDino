package ru.razhapov.example;

import java.util.ArrayList;
import java.util.List;

public class Contacts{
    private String name;
    private String number;
    private long id = 0;
    public static List<Contacts> contactsList = new ArrayList<Contacts>();

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
        this.id = ++id;
    }


    @Override
    public String toString() {
        return "name: " + this.name
                + " number: " + this.number
                + " id: " + this.id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public static void setContactsList(List<Contacts> contactsList) {
        Contacts.contactsList = contactsList;
    }
}
