package service;

import model.Contact;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactBookService {
    private Set<Contact> contacts;
    private Map<String, Integer> contactsMap = new HashMap<>();

    public ContactBookService() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void createContact(String name, Integer phoneNumber) {
        contactsMap.put(name, phoneNumber);
    }

    public void deleteContactByKey(String name) {
        if (!this.contactsMap.isEmpty()) {
            contactsMap.remove(name);
        }
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

    public Integer getContactPhoneNumberByKey(String name) {
        return contactsMap.isEmpty() ? null : contactsMap.get(name);
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

    public void countContacts() {
        System.out.println(contacts.size());
    }
}
