package africa.semicolon.truecaller.controller;

import africa.semicolon.truecaller.services.ContactService;
import africa.semicolon.truecaller.services.ContactServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    private ContactService contactService = new ContactServiceImpl();

    @PostMapping("/contact")
    public String addContact(@RequestBody String firstName, @RequestBody String lastName, @RequestBody String phoneNumber){
        contactService.addContact(firstName, lastName, phoneNumber);
        return "Added Successfully";
    }

    @GetMapping("/contact/{firstName}")
    public String findByFirstName(@PathVariable String firstName){
        return contactService.findById(firstName).toString();
    }

    @GetMapping("/contact/{id}")
    public String findById(@PathVariable String id){
        return contactService.findById(id).toString();
    }

}
