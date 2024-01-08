package project.study.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="grades")
@Getter
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
}
