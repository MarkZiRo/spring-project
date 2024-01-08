package project.study.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "student")
    private List<Grade> grades = new ArrayList<>();
}
