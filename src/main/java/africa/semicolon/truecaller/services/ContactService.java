package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;

import java.util.Optional;

public interface ContactService {
    void addContact(String firstName, String lastName, String phoneNumber);

    Optional<Contact> findById(String id);

    void removeContact(Contact contact);

    Contact editContact(Contact contact, String firstName, String lastName, String phoneNumber);

    Contact findBy(String input);

}
