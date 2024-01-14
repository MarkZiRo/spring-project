package project.study.repository;

import lombok.Getter;
import lombok.Setter;
import project.study.domain.Gradestatus;

@Getter
@Setter
public class GradeSearch {

    private String StudentName;
    private Gradestatus gradestatus;
}
