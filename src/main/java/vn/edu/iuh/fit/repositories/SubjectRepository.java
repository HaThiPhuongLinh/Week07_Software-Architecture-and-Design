package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}