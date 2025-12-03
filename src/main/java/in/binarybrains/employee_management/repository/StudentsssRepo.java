package in.binarybrains.employee_management.repository;

import in.binarybrains.employee_management.model.Studentsss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@EnableJpaRepositories
@Repository
public interface StudentsssRepo extends JpaRepository<Studentsss, Integer> {
//     Optional<List<Studentsss>>
//    @Query("select * from studentsss where name = ?1")
    List<Studentsss> findByName( String name);
}
