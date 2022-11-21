package com.bridgelab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contacts contacts;
    Map<String, List> map = new HashMap<>();
    ArrayList<Contacts> list = new ArrayList<>();

    public void addNewAddressBook() {
        System.out.println("Enter AddressBook Name :");
        String addressbook = sc.next();
        if (map.keySet().equals(addressbook)) {
            System.out.println("Entered AddressBook is already Exist");
        } else {
            map.put(addressbook, list);
        }
    }

    public void showAddressBook() {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
    public void checkContact(){
        System.out.println("Enter AddressBook Name :");
        String adname = sc.next();
        for (String key : map.keySet()) {
            if (!adname.equalsIgnoreCase(key)) {
                System.out.println("Address Book Not Found-----!!!");
            }else{
                System.out.println("Match Found-----!!");
                System.out.println("Enter First Name :");
                String firstName = sc.next();
                try {
                    if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
                        addNewContact();
                    }else{
                        System.out.println("Contact Already Exist");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Contact Not Found------!!, Please Add First");
                    addNewContact();

                }
            }
        }
    }
    public void addNewContact() {
        contacts = new Contacts();
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the PIN Code :");
        contacts.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmailID(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
    }
    public void displayContact () {
        try {
            if (contacts.getFirstName() == null) {
                System.out.println("Contact Not Found");
            } else {
                for (Contacts cont : list) {
                    System.out.println(cont);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Contact Not Found----!!");
        }
    }

    public void editContact () {
        contacts = new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstName(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastName(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the PIN Code :");
            contacts.setZip(sc.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNo(sc.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmailID(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }

    public void deleteContact () {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        try {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                list.remove(contacts);
                System.out.println("Contact Deleted Successfully-------!!!");
            } else {
                System.out.println("Not Found");
            }
        } catch (NullPointerException e) {
            System.out.println("Contact Not Found---!!");
        }
    }

    public void writeInFile(){
        try {
            FileWriter write=new FileWriter("Contact.txt");
            write.write(String.valueOf(map));
            write.flush();
            write.close();
        } catch (IOException e) {
            System.out.println("Successfully Write in file");;
        }
    }
    public void readFromFile() {
        FileReader reader = null;
        try {
            reader = new FileReader("Contact.txt");
            int i;
            while ((i = reader.read()) != -1)
                System.out.print((char) i);
            reader.close();
        } catch (Exception e) {
            System.out.println("Successfully read");
        }
    }
}
