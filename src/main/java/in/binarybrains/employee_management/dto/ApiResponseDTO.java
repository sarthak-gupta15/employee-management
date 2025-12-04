package in.binarybrains.employee_management.dto;

import in.binarybrains.employee_management.model.Studentsss;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class ApiResponseDTO<T> {
    String message;
    HttpStatus code;
//    List<Studentsss> Data;
    T Data;
}
