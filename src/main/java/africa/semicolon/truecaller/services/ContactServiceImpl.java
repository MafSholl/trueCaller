package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contactRepository.save(contact);
    }

    @Override
    public Optional<Contact> findById(String id) {
        Optional<Contact> found = contactRepository.findById(id);
        if(found.isEmpty()) throw new NullPointerException("Contact not found");
        return found;
    }

    @Override
    public void removeContact(Contact contact) {
        contactRepository.delete(contact);
    }

    @Override
    public Contact editContact(Contact contact, String firstName, String lastName, String phoneNumber) {
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        return contactRepository.save(contact);
    }

    @Override
    public Contact findBy(String input) {
        return null;
    }

}
