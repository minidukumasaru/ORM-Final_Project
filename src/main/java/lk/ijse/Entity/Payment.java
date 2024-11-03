package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Payment {
    @Id
    private String pay_id;
    private String pay_date;
    private double pay_amount;
    private String status;

    @ManyToOne
    @JoinColumn(name = "student_course_id")
    private Student_Course student_course;
}
