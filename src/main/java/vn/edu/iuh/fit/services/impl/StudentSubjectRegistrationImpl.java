package vn.edu.iuh.fit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Registration;
import vn.edu.iuh.fit.repositories.RegistrationRepository;
import vn.edu.iuh.fit.services.StudentSubjectRegistration;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class StudentSubjectRegistrationImpl implements StudentSubjectRegistration {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    private RegistrationRepository repository;

    @Override
    public boolean register(long studentId, long subjectId) {
        try {
            Registration registration = new Registration(studentId, subjectId);
            registration.setNotes("successfully");
            registration.setResult(0f);
            repository.save(registration);
            return true;
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getCause() + "\n" + e.getMessage());
            return false;
        }
    }
}
