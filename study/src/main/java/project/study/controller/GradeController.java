package project.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.study.domain.Grade;
import project.study.domain.Gradestatus;
import project.study.domain.Student;
import project.study.domain.Subject.Subject;
import project.study.service.GradeService;
import project.study.service.StudentService;
import project.study.service.SubjectService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;
    private final StudentService studentService;
    private final SubjectService subjectService;

    @GetMapping("/grade")
    public String createForm(Model model)
    {
        List<Student> studentList = studentService.findStudents();
        List<Subject> subjectList = subjectService.findSubjects();

        model.addAttribute("students", studentList);
        model.addAttribute("subjects", subjectList);

        return "grade/gradeForm";
    }

    @PostMapping("/grade")
    public String grade(@RequestParam("studentId") Long memberId, @RequestParam("subjectId") Long subjectId)
    {

       gradeService.grade(memberId,subjectId);

       return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String gradeList(@ModelAttribute("gradeStatus")Gradestatus gradestatus, Model model)
    {
        List<Grade> grades = gradeService.findGrades(gradestatus);
        model.addAttribute("grades", grades);

        return "grade/grades";
    }
}
