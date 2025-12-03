package in.binarybrains.employee_management.controller;

import in.binarybrains.employee_management.model.Employee;
import in.binarybrains.employee_management.service.EmployeeService;
import in.binarybrains.employee_management.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

//    EmployeeService employeeService = new EmployeeServiceImpl();

    @Autowired
    EmployeeService employeeService; // by dependency injection
//    there 3 types
//    1. field injection
//    2. setter injection
//    @Autowired
//    public void setEmployeeService(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

//    3. constructor injection

//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

//    4. lookup method

//    response entity use to send response with status code
    @PostMapping("/create")
    public ResponseEntity<String> createEmp(
            @RequestBody Employee employee){
        return employeeService.createEmp(employee);

    }

    @GetMapping("/read")
    public ResponseEntity<List<Employee>>  getAllEmp(){
        List<Employee> empData = employeeService.getAllEmp();
//        return new ResponseEntity<>(empData, HttpStatus.OK);
        return  ResponseEntity.ok(empData);

    }
}
