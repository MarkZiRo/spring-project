package project.study.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.Student;
import project.study.repository.StudentRepositoryJPA;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class StudentServiceTest {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepositoryJPA studentRepository;

    @Test
    public void join() throws Exception
    {
        Student student = new Student();
        student.setName("abc");

        Long savedId = studentService.join(student);

        assertThat(student).isEqualTo(studentRepository.findOne(savedId));
    }

    @Test
    public void join_ex() throws Exception
    {
        Student student1 = new Student();
        student1.setName("stu1");

        Student student2 = new Student();
        student2.setName("stu1");

        studentService.join(student1);
        studentService.join(student2);
    }
}