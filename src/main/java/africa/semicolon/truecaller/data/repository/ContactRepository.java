package africa.semicolon.truecaller.data.repository;

import africa.semicolon.truecaller.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContactRepository extends MongoRepository<Contact, String> {

    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName(String firstName);
    Contact findByPhoneNumber(String phoneNumber);

}
