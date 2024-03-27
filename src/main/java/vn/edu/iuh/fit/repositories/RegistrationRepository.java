package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.entities.Ids.RegistrationId;
import vn.edu.iuh.fit.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, RegistrationId> {
}