package app;

import model.Contact;
import service.ContactBookService;

public class MainContacts {
    public static void main(String[] args) {
        ContactBookService contactBookService = new ContactBookService();

        contactBookService.showContacts();
        contactBookService.countContacts();

        contactBookService.addContact("Jeff Daniels", 456987);
        contactBookService.addContact("Jeff Bridges", 3216548);
        contactBookService.addContact("Jeff Goldblum", 553218563);
        contactBookService.addContact("Thomas Goldblum", 3218563);
        contactBookService.addContact("Jeff Dean Morgan", 15936542);
        contactBookService.addContact("Jeff Wright", 1254896);
        contactBookService.addContact("Jeff Tambor", 231654);
        contactBookService.addContact("Jeff Rush", 23198467);
        contactBookService.addContact("Jeff Combs", 75326482);
        contactBookService.addContact("Jeff Donovan", 123489657);
        contactBookService.addContact("Jeff Jones", 1234789);

        contactBookService.showContacts();
        contactBookService.countContacts();

        for (Contact contact : contactBookService.findContactContainingName("Goldblum")) {
            System.out.println(contact);
        }


        System.out.println(contactBookService.updateContactPhoneNumber("Jeff Goldblum",13218563));
    }
}
