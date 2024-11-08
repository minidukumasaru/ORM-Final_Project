package lk.ijse.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    private String stu_id;
    private String stu_name;
    private String stu_address;
    private String stu_phone;
    private Date date;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Student_Course> studentCourses;

    @ManyToOne
    private User user;
}
