package in.binarybrains.employee_management.model;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private String designation;
}
