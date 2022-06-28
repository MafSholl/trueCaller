package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.repository.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceImplTest {

//    private ContactRepository contactRepository = new ContactRepositoryImpl();
//    private ContactService contactService;
//
//    @BeforeEach
//    public void setUp(){
//        contactService = new ContactServiceImpl();
//    }
//
//    @Test
//    public void saveContact_findContactReturnsContactTest(){
//        contactService.addContact("Ijebu", "Ode", "08170000");
//
//        Contact contact = contactService.findById(1);
//        assertEquals("Ijebu", contact.getFirstName());
//        assertEquals("Ode", contact.getLastName());
//        assertEquals("08170000", contact.getPhoneNumber());
////        assertEquals(1, contactRepository.count());
////        assertEquals(contact, contactRepository.findById(1));
//    }
//
//    @Test
//    public void savedContact_CanBeDeletedTest(){
//        contactService.addContact("Ijebu", "Ode", "08170000");
//        contactService.addContact("Akinlabi", "Ojo", "09090000");
//
//        Contact contactToBeDeleted = contactService.findById(1);
////        boolean isContactOneDeleted = contactService.removeContact(contactToBeDeleted);
//        contactService.removeContact(contactToBeDeleted);
//        Contact contactNowAtIndexZero = contactService.findById(1);
//
////        assertTrue(isContactOneDeleted);
//        assertEquals(2, contactNowAtIndexZero.getId());
//        assertEquals("Akinlabi", contactNowAtIndexZero.getFirstName());
//        assertEquals("Ojo", contactNowAtIndexZero.getLastName());
//        assertEquals("09090000", contactNowAtIndexZero.getPhoneNumber());
////        assertEquals(contactNowAtIndexZero, contactRepository.findById(1));
//    }
//
//    @Test
//    public void savedContact_canBeEditedTest(){
//        contactService.addContact("Ijebu", "Ode", "08170000");
//        contactService.addContact("Akinlabi", "Ojo", "09090000");
//
//        Contact contactOne = contactService.findById(1);
////        Contact editedContact = contactService.editContact(contactOne, "Ajanlekoko", "Kokumo", "08170000");
//        contactService.editContact(contactOne, "Ajanlekoko", "Kokumo", "08170000");
//        Contact editedContact = contactService.findById(1);
////        Contact repositoryContact = contactRepository.findById(1);
//
////        assertEquals(editedContact, editedContact);
//        assertEquals(1, editedContact.getId());
//        assertEquals("Ajanlekoko", editedContact.getFirstName());
//        assertEquals("Kokumo", editedContact.getLastName());
//        assertEquals("08170000", editedContact.getPhoneNumber());
////        assertEquals(editedContact, repositoryContact);
//
//    }
}