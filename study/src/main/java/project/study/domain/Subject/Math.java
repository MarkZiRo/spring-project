package project.study.domain.Subject;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue("M")
public class Math extends Subject{
    private String math;
}
