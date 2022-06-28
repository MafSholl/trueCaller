package africa.semicolon.truecaller.data.repository;

import africa.semicolon.truecaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
//        private ContactRepository contactRepository;
//        @BeforeEach
//        public void setThisUp(){
//            contactRepository = new ContactRepositoryImpl();
//        }
//
//        @Test
//        public void saveContact_countIsOneTest(){
//            Contact contact = new Contact();
//            contact.setFirstName("Shamson");
//
//            Contact savedContact = contactRepository.save(contact);
//            assertEquals(1, savedContact.getId());
//            assertEquals(1, contactRepository.count());
//        }
//
//        @Test
//        public void saveContact_countIsTwoTest(){
//            Contact contact1 = new Contact();
//            contact1.setFirstName("Shamson");
//            Contact savedContact = contactRepository.save(contact1);
//            assertEquals(1, savedContact.getId());
//
//            Contact contact2 = new Contact();
//            contact2.setFirstName("Ladi");
//            Contact secondSavedContact = contactRepository.save(contact2);
//            assertEquals(2, contactRepository.count());
//            assertEquals(2, secondSavedContact.getId());
//        }
//
//        @Test
//        public void saveContact_findByIdReturnsContact(){
//            Contact contact1 = new Contact();
//            contact1.setFirstName("Samson");
//            Contact contact2 = new Contact();
//            contact2.setFirstName("Abiola");
//
//            Contact savedContact1 = contactRepository.save(contact1);
//            Contact savedContact2 = contactRepository.save(contact2);
//
//            Contact firstContact = contactRepository.findById(1);
//            Contact secondContact = contactRepository.findById(2);
//
//
//            assertEquals(1, firstContact.getId());
//            assertEquals(2, secondContact.getId());
//            assertEquals("Samson", firstContact.getFirstName());
//            assertEquals("Abiola", secondContact.getFirstName());
//        }
//
//        @Test
//        public void saveContact_findByNameReturnsContact(){
//            Contact contact1 = new Contact();
//            contact1.setFirstName("Samson");
//            Contact contact2 = new Contact();
//            contact2.setFirstName("Abiola");
//
//            Contact savedContact1 = contactRepository.save(contact1);
//            Contact savedContact2 = contactRepository.save(contact2);
//
//            Contact firstContact = contactRepository.findBy("Samson");
//            Contact secondContact = contactRepository.findBy("Abiola");
//
//            assertEquals(1, firstContact.getId());
//            assertEquals(2, secondContact.getId());
//            assertEquals("Samson", firstContact.getFirstName());
//            assertEquals("Abiola", secondContact.getFirstName());
//        }
//
//        @Test
//        public void saveContact_findByLastNameReturnsContact(){
//            Contact contact1 = new Contact();
//            contact1.setLastName("Lade");
//            Contact contact2 = new Contact();
//            contact2.setLastName("Aanuoluwa");
//
//            Contact contactSaver1 = contactRepository.save(contact1);
//            Contact contactSaver2 = contactRepository.save(contact2);
//
//            Contact firstContact = contactRepository.findByLastName("Lade");
//            Contact secondContact = contactRepository.findByLastName("Aanuoluwa");
//
//            assertEquals(1, firstContact.getId());
//            assertEquals(2, secondContact.getId());
//            assertEquals("Lade", firstContact.getLastName());
//            assertEquals("Aanuoluwa", secondContact.getLastName());
//        }
//
//        @Test
//        public void savedContact_CanBeDeletedTest(){
//            Contact contact1 = new Contact();
//            contact1.setFirstName("Ogundele");
//            contact1.setLastName("Victoria");
//            Contact contact2 = new Contact();
//            contact2.setFirstName("Ogundele");
//            contact2.setLastName("Aanuoluwa");
//
//            Contact contactSaver1 = contactRepository.save(contact1);
//            Contact contactSaver2 = contactRepository.save(contact2);
//            Boolean isContactOneDelete = contactRepository.delete(contact1);
//            assertEquals(true, isContactOneDelete);
//
//            Contact newContactOne = contactRepository.findById(1);
//
//            assertEquals(2, newContactOne.getId());
//            assertEquals("Ogundele", newContactOne.getFirstName());
//            assertEquals("Aanuoluwa", newContactOne.getLastName());
//        }
//
//        @Test
//        public void savedContactDetails_CanBeEditedTest(){
//            Contact contact1 = new Contact();
//            contact1.setFirstName("Victoria");
//            contact1.setLastName("Ogundele");
//
//            Contact saveContact = contactRepository.save(contact1);
//
//            Contact editedcontact = contactRepository.changeContactDetails(contact1, "Aanuoluwa", "Ogundele", "Ade");
//
//            assertEquals(1, editedcontact.getId());
//            assertEquals(1, contactRepository.count());
//            assertEquals("Aanuoluwa", editedcontact.getFirstName());
//            assertEquals("Ogundele", editedcontact.getLastName());
//        }

}