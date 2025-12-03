package in.binarybrains.employee_management.service.impl;

import in.binarybrains.employee_management.dao.EmployeeDao;
import in.binarybrains.employee_management.model.Employee;
import in.binarybrains.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public ResponseEntity<String> createEmp( Employee employee ){
//        System.out.println("hello");
//        ResponseEntity<String> responseEntity = new ResponseEntity<>("failed", HttpStatusCode.valueOf(400));
//        return responseEntity;
        Boolean result = employeeDao.createEmpl(employee);
        if(result) return  new ResponseEntity<>("Success", HttpStatus.OK);
        else return  new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @Override
    public List<Employee> getAllEmp() {
        List<Employee> empData = employeeDao.getAllEmp();
        return empData;
    }
}
