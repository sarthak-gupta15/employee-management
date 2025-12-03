package in.binarybrains.employee_management.service;

import in.binarybrains.employee_management.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

     ResponseEntity<String> createEmp(Employee employee);

    List<Employee> getAllEmp();
}
