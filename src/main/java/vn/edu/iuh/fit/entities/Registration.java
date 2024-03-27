package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.entities.Ids.RegistrationId;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@IdClass(RegistrationId.class)
public class Registration {
    @Id
    private long studentId;
    @Id
    private long subjectId;
    private float result;
    private String notes;

     public Registration(long studentId, long subjectId) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.result = result;
        this.notes = notes;
    }

}
