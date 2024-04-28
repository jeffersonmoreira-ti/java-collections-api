package model;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contacts;

    public ContactBook() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public Set<Contact> findContactContainingName(String name) {
        Set<Contact> contactsContainingName = new HashSet<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(name)) {
                contactsContainingName.add(contact);
            }
        }
        return contactsContainingName;
    }

    public Contact updateContactPhoneNumber(String name, int phoneNumber) {
        Contact updatedContact = findContactByName(name);

        if (updatedContact != null) {
            updatedContact.setPhoneNumber(phoneNumber);
        }

        return updatedContact;
    }

    public void countContacts(){
        System.out.println(contacts.size());
    }
}
