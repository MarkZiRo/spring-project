package project.study.domain.Subject;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue("E")
public class English extends Subject{

    private String eng;
}
