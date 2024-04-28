package app;

import model.Contact;
import model.ContactBook;

public class MainContacts {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.showContacts();
        contactBook.countContacts();

        contactBook.addContact("Jeff Daniels", 456987);
        contactBook.addContact("Jeff Bridges", 3216548);
        contactBook.addContact("Jeff Goldblum", 553218563);
        contactBook.addContact("Thomas Goldblum", 3218563);
        contactBook.addContact("Jeff Dean Morgan", 15936542);
        contactBook.addContact("Jeff Wright", 1254896);
        contactBook.addContact("Jeff Tambor", 231654);
        contactBook.addContact("Jeff Rush", 23198467);
        contactBook.addContact("Jeff Combs", 75326482);
        contactBook.addContact("Jeff Donovan", 123489657);
        contactBook.addContact("Jeff Jones", 1234789);

        contactBook.showContacts();
        contactBook.countContacts();

        for (Contact contact : contactBook.findContactContainingName("Goldblum")) {
            System.out.println(contact);
        }


        System.out.println(contactBook.updateContactPhoneNumber("Jeff Goldblum",13218563));
    }
}
