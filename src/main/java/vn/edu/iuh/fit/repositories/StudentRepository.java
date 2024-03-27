package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s.id, s.name, r.result, r.notes from Subject s join Registration r on s.id = r.subjectId where r.studentId = :id")
    List<Object[]> getAllResgisteredSubject(long id);

}