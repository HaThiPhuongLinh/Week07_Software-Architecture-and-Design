package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.repositories.SubjectRepository;

import java.util.List;

@Service
public class SubjectServices {
    @Autowired
    private SubjectRepository subjectRepository;

    //INSERT AND UPDATE
    public void save(Subject subject){
        subjectRepository.save(subject);
    }

    public Subject findSubjectById(long id){
        return subjectRepository.findById(id).orElse(null);
    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }

    public void delete(long id){
        subjectRepository.deleteById(id);
    }
}
