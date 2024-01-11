package project.study.service;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.*;
import project.study.domain.Subject.Subject;
import project.study.repository.GradeRepository;
import project.study.repository.StudentRepository;
import project.study.repository.SubejctRepository;

import java.util.List;

import static project.study.domain.QGrade.grade;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GradeService {

    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;
    private final SubejctRepository subejctRepository;

    @Autowired
    EntityManager em;



    @Transactional
    public Long grade(Long studentId, Long subjectId)
    {
        Student student = studentRepository.findOne(studentId);
        Subject subject = subejctRepository.findOne(subjectId);

        Scholarship scholarship = new Scholarship();
        scholarship.setAddress(student.getAddress());

        ReportCard reportCard = ReportCard.createReportCard(subject, subject.getScore());

        Grade grade = Grade.createGrade(student, scholarship, reportCard);

        gradeRepository.save(grade);

        return grade.getId();
    }

    // -

    @Transactional
    public void cancelGrade(Long gradeId)
    {
        Grade grade = gradeRepository.findOne(gradeId);

        grade.plusScore();
    }



    public List<Grade> findGrades(Gradestatus gradestatus)
    {
        QGrade grade = QGrade.grade;
        QStudent student = QStudent.student;

        JPAQueryFactory query = new JPAQueryFactory(em);

        return query
                .select(grade)
                .from(grade)
                .join(grade.student, student)
                .limit(1000)
                .fetch();

    }
}
