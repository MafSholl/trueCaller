package africa.semicolon.truecaller;

import africa.semicolon.truecaller.controller.ContactController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    private static final ContactController contactController = new ContactController();
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }
}
