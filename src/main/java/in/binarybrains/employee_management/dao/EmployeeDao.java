package in.binarybrains.employee_management.dao;

import in.binarybrains.employee_management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {
    private String name;
    private Integer age;
    private Double salary;
    private String designation;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Boolean createEmpl(Employee employee)
    {
        String createTable = "create table if not exists  employee (Id serial, name varchar, age int, salary float, designation varchar)";
        String insert = "insert into employee (name , age , salary , designation ) values (?, ?, ?, ?)";

        jdbcTemplate.execute(createTable);
       int i = jdbcTemplate.update(insert, employee.getName(), employee.getAge(), employee.getSalary(), employee.getDesignation());
        if(i>0) return  true;
        else return  false;
    }

    public List<Employee> getAllEmp(){
        String getEmp = "select * from employee";
        List<Employee> emp = jdbcTemplate.query(getEmp, new BeanPropertyRowMapper<>(Employee.class));
        return emp;
    }

}
