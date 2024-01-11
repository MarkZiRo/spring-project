package project.study.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.study.domain.Subject.Subject;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReportCard {

    @Id
    @GeneratedValue
    @Column(name = "Reportcard_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id")
    private Grade grade;

    private int score;

    public static ReportCard createReportCard(Subject subject, int score)
    {
        ReportCard reportCard = new ReportCard();
        reportCard.setSubject(subject);
        reportCard.setScore(score);

        return reportCard;
    }

    public void plusScore()
    {
        getSubject().addScore(score);
    }

    public int getTotalScore() {
        return score;
    }
}
