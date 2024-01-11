package project.study.service;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.Address;
import project.study.domain.Grade;
import project.study.domain.Student;
import project.study.domain.Subject.English;
import project.study.domain.Subject.Subject;
import project.study.repository.GradeRepository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GradeServiceTest {

    @Autowired
    EntityManager em;

    @Autowired
    GradeService gradeService;

    @Autowired
    GradeRepository gradeRepository;

    @Test
    public void GradeTest1() throws Exception
    {
        Student student = new Student();
        student.setName("student1");
        student.setAddress(new Address("dajeon", "junmin") );
        em.persist(student);

        Subject english = new English();
        english.setName("eng1");
        english.setScore(80);
        em.persist(english);

        Long gradeId = gradeService.grade(student.getId(), english.getId());

        Grade grade = gradeRepository.findOne(gradeId);

        assertThat(grade.getReportCardList().size()).isEqualTo(1);

    }

    @Test
    public void GradeTest2() throws Exception
    {

    }

    @Test
    public void GradeTest3() throws Exception
    {

    }
}