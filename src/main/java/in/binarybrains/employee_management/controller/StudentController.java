package in.binarybrains.employee_management.controller;

import in.binarybrains.employee_management.dto.ApiResponseDTO;
import in.binarybrains.employee_management.model.Studentsss;
import in.binarybrains.employee_management.repository.StudentsssRepo;
import in.binarybrains.employee_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentsssRepo studentsssRepo;

    @Autowired
    StudentService studentService;



    @PostMapping("/create_student")
    ResponseEntity<String> createStudent(@RequestBody Studentsss studentsss){
        studentsssRepo.save(studentsss);
        return new ResponseEntity<>("Sucess", HttpStatus.OK);
    }

    @GetMapping("/find-student-{id}")
    ResponseEntity<Studentsss> findStudentBy(@PathVariable Integer id){
        Studentsss student = studentService.findStudentBy(id);
        if(student == null)
        {
            ResponseEntity res = new ResponseEntity(null, HttpStatus.NOT_FOUND);
            return  res;
        }
        else{
            return  ResponseEntity.ok(student);
        }
    }

    @GetMapping("/find-student-by-{name}")
    ResponseEntity<List<Studentsss>> findStudentByName(@PathVariable String name){
        List<Studentsss> student = studentService.findStudentByName(name);
        if(student.isEmpty())
        {
            ResponseEntity res = new ResponseEntity(null, HttpStatus.NOT_FOUND);
            return  res;
        }
        else{
            return  ResponseEntity.ok(student);
        }
    }

    @GetMapping("/get-all-student")
    ResponseEntity<ApiResponseDTO<List<Studentsss>>> findAllStudentData(){
        List<Studentsss> studentsssList = studentService.findAllStudentData();
//        if(studentsssList.isEmpty())
//        {
            ResponseEntity res = new ResponseEntity(ApiResponseDTO.builder().message("unable to find any data").code(HttpStatus.NOT_FOUND).Data(null).build(), HttpStatus.NOT_FOUND);
            return  res;
//        }
//        else{
//            ApiResponseDTO responseDTO = ApiResponseDTO.builder().message("Data fetch successfully").code(HttpStatus.OK).Data(studentsssList).build();
////            ApiResponseDTO<List<Studentsss>> responseDTO1 = new ApiResponseDTO("" , null, null);
//            return  ResponseEntity.ok(responseDTO);
//        }
    }
}
