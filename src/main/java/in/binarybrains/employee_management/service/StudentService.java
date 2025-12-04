package in.binarybrains.employee_management.service;

import in.binarybrains.employee_management.model.Studentsss;

import java.util.List;

public interface StudentService {
    Studentsss findStudentBy(Integer id);
    List<Studentsss> findStudentByName(String name);
    List<Studentsss> findAllStudentData();
}
