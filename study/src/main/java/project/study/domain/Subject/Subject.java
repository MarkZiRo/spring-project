package project.study.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public abstract class Subject {

    @Id
    @GeneratedValue
    @Column(name = "report_id")
    private Long id;

    private String name;
    private String report;

}
