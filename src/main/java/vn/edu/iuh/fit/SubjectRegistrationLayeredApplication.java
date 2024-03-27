package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.services.StudentServices;
import vn.edu.iuh.fit.services.SubjectServices;


@SpringBootApplication
public class SubjectRegistrationLayeredApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SubjectRegistrationLayeredApplication.class, args);
    }

    @Autowired
    private StudentServices studentServices;

    @Autowired
    private SubjectServices subjectServices;

    @Override
    public void run(String... args) throws Exception {
        studentServices.save(new Student("Henry Lu","henry@gmail.com"));
        studentServices.save(new Student("Kim Tan","kimtan@gmail.com"));
        studentServices.save(new Student("Pack Jim","pjim@gmail.com"));

        subjectServices.save(new Subject("OOP (Object-oriented programming)"));
        subjectServices.save(new Subject("Math"));
        subjectServices.save(new Subject("Physics"));
        subjectServices.save(new Subject("History"));
        subjectServices.save(new Subject("Economy"));
    }
}
