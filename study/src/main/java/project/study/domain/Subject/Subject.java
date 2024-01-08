package project.study.domain.Subject;

import jakarta.persistence.*;
import lombok.Getter;
import project.study.exception.NotEnoughException;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
public abstract class Subject {

    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private Long id;

    private String name;
    private int score;

    public void addScore(int number)
    {
        this.score += number;
    }

    public void removeScore(int number)
    {
       int myNumber = this.score - number;
       if(myNumber <0)
       {
           throw new NotEnoughException("my number is minus");
       }

       this.score = myNumber;
    }
}
