package project.study.api;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.study.domain.Address;
import project.study.domain.Grade;
import project.study.domain.Gradestatus;
import project.study.domain.ReportCard;
import project.study.repository.GradeRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class GradeApiController2 {

    private final GradeRepository gradeRepository;

//    @GetMapping("/api/grades")
//    public List<GradeDto> grades()
//    {
//        List<Grade> grades = gradeRepository.findAll();
//    }

    @Data
    static class GradeDto{

        private Long gradeId;
        private String name;
        private LocalDateTime gradeDate;
        private Gradestatus gradestatus;
        private Address address;
        private List<ReportCardDto> reportCardList;

        public GradeDto(Grade grade)
        {
            gradeId = grade.getId();
            name = grade.getStudent().getName();
            gradestatus = grade.getStatus();
            gradeDate = grade.getLocalDateTime();
            address = grade.getScholarship().getAddress();
            reportCardList = grade.getReportCardList().stream().map(reportCard ->  new ReportCardDto(reportCard))
                    .collect(Collectors.toList());

        }
    }

    @Getter
    static class ReportCardDto{

        private int score;

        public ReportCardDto(ReportCard reportCard)
        {
            score = reportCard.getScore();
        }
    }
}
