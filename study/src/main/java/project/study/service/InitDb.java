package project.study.service;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.*;
import project.study.domain.Subject.English;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init()
    {
        initService.dbInit1();
    }


    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService
    {
        private final EntityManager em;
        public void dbInit1()
        {
            Student student = new Student();
            student.setName("studentA");
            student.setAddress(new Address("daejeon", "janmin"));
            em.persist(student);

            English english1 = new English();
            english1.setProfessor("kim");
            english1.setScore(50);
            english1.setName("a");
            em.persist(english1);

            English english2 = new English();
            english2.setProfessor("min");
            english2.setScore(60);
            english2.setName("b");
            em.persist(english2);

            ReportCard reportCard1 = ReportCard.createReportCard(english1, 50);
            ReportCard reportCard2 = ReportCard.createReportCard(english2, 60);

            Scholarship scholarship = new Scholarship();
            scholarship.setAddress(student.getAddress());
            Grade grade = Grade.createGrade(student,scholarship,reportCard1,reportCard2);
            em.persist(grade);
        }
    }
}
