package in.binarybrains.employee_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "studentsss")
public class Studentsss {
    @Id
    Integer rollNo; // primary key
//    @Column(unique = true, name = "Name", nullable = false)
    String name;
    String department;
    Integer age;
    String gender;
}
