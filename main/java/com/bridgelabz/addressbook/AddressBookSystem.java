package com.bridgelabz.addressbook;

import java.util.ArrayList;

public class AddressBookSystem {
    public static void main(String[] args) {
        /*
         * Starting with displaying welcome to address program
         * */

        System.out.println("Welcome to Address Book Program");
        Contacts.createContact("Akshatha","Anjananagar","Bangalore","Karnataka",
                "560091","9110237051","akshatha98@gmail.com");
    }
    class Contacts {
        /**creating contact using Arraylist **/

        static void createContact(String name, String address, String city, String state, String zipCode, String phoneNo, String email) {
            ArrayList<String> firstContact = new ArrayList<String>(7);

            firstContact.add(name);
            firstContact.add(address);
            firstContact.add(city);
            firstContact.add(state);
            firstContact.add(zipCode);
            firstContact.add(phoneNo);
            firstContact.add(email);

            System.out.println(firstContact );

        }
    }
}
