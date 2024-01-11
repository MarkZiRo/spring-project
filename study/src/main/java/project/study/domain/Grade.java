package project.study.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="grades")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Grade {

    @Id
    @GeneratedValue
    @Column(name = "grade_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "grade" , cascade = CascadeType.ALL)
    private List<ReportCard> reportCardList = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "scholarship_id")
    private Scholarship scholarship;

    private LocalDateTime localDateTime;

    @Enumerated(EnumType.STRING)
    private Gradestatus status;

    public void setStudent(Student student)
    {
        this.student = student;
        student.getGrades().add(this);
    }

    public void addReportCard(ReportCard reportCard)
    {
        reportCardList.add(reportCard);
        reportCard.setGrade(this);
    }

    public void setScholarship(Scholarship scholarship)
    {
        this.scholarship =scholarship;
        scholarship.setGrade(this);
    }

    public static Grade createGrade(Student student, Scholarship scholarship, ReportCard... reportCards)
    {
        Grade grade = new Grade();
        grade.setStudent(student);
        grade.setScholarship(scholarship);
        for (ReportCard reportCard : reportCards) {
            grade.addReportCard(reportCard);
        }
        grade.setStatus(Gradestatus.correction);
        grade.setLocalDateTime(LocalDateTime.now());
        return grade;
    }

    public void plusScore()
    {
        for (ReportCard reportCard : reportCardList) {
            reportCard.plusScore();
        }
    }

    public int getTotalScore()
    {
        int totalPrice =0;
        for (ReportCard reportCard : reportCardList) {
            totalPrice += reportCard.getTotalScore();
        }
        return totalPrice;
    }
}
