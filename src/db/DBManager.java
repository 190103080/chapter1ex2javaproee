package db;

import java.util.ArrayList;

public class DBManager {
   private static ArrayList<Contact> contacts = new ArrayList<>();

    static {
        contacts.add(new Contact("Ilyas","Zhuanyshev","IT", 550000));
        contacts.add(new Contact("Aybek","Bagit","Management", 650000));
        contacts.add(new Contact("Alibek","Serikov","HR", 350000));
        contacts.add(new Contact("Serzhan","Berikov","IT", 450000));
        contacts.add(new Contact("Madina","Assetova","PR", 350000));
        contacts.add(new Contact("Anel","Mukhamejanova","Management", 400000));
    }

    public static ArrayList<Contact> getAllContacts() {
        return contacts;
    }
}
