package project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.study.domain.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByName(String name);
}
