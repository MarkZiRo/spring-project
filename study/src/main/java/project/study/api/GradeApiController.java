package project.study.api;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.study.domain.Address;
import project.study.domain.Grade;
import project.study.domain.Gradestatus;
import project.study.repository.GradeRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class GradeApiController {

    private final GradeRepository gradeRepository;

    @GetMapping("/api/simpleGrade")
    public List<SimpleGradeDto> gradeV()
    {
        List<Grade> grades = gradeRepository.finalAllWithScholarship();
        return   grades.stream()
                .map(SimpleGradeDto::new)
                .collect(Collectors.toList());
    }

    @Data
    static class SimpleGradeDto
    {
        private Long gradeId;
        private String name;
        private Gradestatus gradestatus;
        private LocalDateTime gradeDate;
        private Address address;

        public SimpleGradeDto(Grade grade)
        {
            gradeId = grade.getId();
            name = grade.getStudent().getName();
            gradestatus = grade.getStatus();
            gradeDate = grade.getLocalDateTime();
            address = grade.getScholarship().getAddress();
        }
    }

}
