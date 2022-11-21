package com.bridgelab;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        AddressBook addressBook=new AddressBook();
        do {System.out.println("1. Add New AddressBook\n2. Add Contact \n3. Edit Contact\n4. Delete Contact\n5. Display Contact\n6. Write in file \n7. Read from File \n8.Exit");
            System.out.println("Enter Choise :");
            choice=sc.nextInt();
            switch (choice){
                case 1:addressBook.addNewAddressBook();
                break;
                case 2:
                    addressBook.checkContact();
                    break;
                case 3:
                    addressBook.editContact();
                break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    addressBook.displayContact();
                    break;
                case 6:
                    addressBook.writeInFile();
                break;
                case 7:
                    addressBook.readFromFile();
                    break;
                case 8:
                    System.out.println("Exit------!");
                    break;
                default:
                    System.out.println("Please Enter Valid Input");
            }
        }while (choice!=8);
    }
}
