package in.binarybrains.employee_management.service.impl;

import in.binarybrains.employee_management.model.Studentsss;
import in.binarybrains.employee_management.repository.StudentsssRepo;
import in.binarybrains.employee_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentsssRepo studentsssRepo;

    @Override
    public Studentsss findStudentBy(Integer id) {
        Optional<Studentsss> studentData = studentsssRepo.findById(id);
        if(studentData.isPresent()) return studentData.get();
        else return null;
    }

    @Override
    public List<Studentsss> findStudentByName(String name){
        List<Studentsss> studenData =  studentsssRepo.findByName(name);
        return studenData;
    }
}
