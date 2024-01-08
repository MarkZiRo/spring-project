package project.study.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Scholarship {

    @Id
    @GeneratedValue
    @Column(name ="scholarship_id")
    private Long id;

    @OneToOne(mappedBy = "scholarship" , fetch = FetchType.LAZY)
    private Grade grade;

    @Embedded
    private Address address;
}
