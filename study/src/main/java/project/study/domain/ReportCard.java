package project.study.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.study.domain.Subject.Subject;

@Entity
@Getter
@Setter
public class ReportCard {

    @Id
    @GeneratedValue
    @Column(name = "Reportcard_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject report;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id")
    private Grade grade;


}
