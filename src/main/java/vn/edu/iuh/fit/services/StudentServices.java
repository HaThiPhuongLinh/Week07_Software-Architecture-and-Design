package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.repositories.StudentRepository;
import vn.edu.iuh.fit.utils.StudentStatus;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    private StudentRepository studentRepository;

    //INSERT AND UPDATE
    public void save(Student student){
        studentRepository.save(student);
    }

    //DELETE
    public void setSate(Student student, StudentStatus studentStatus){
        student.setStatus(studentStatus);
    }

    public Student findStudentById(long id){
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public List<Object[]> getAllResgisteredSubject(long id){
        return studentRepository.getAllResgisteredSubject(id);
    }
}
