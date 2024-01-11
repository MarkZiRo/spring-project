package project.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.study.domain.Address;
import project.study.domain.Student;
import project.study.service.StudentService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students/new")
    public String createForm(Model model)
    {
        model.addAttribute("studentForm", new StudentForm());
        return "students/createStudentForm";
    }

    @PostMapping("/students/new")
    public String create(StudentForm studentForm, BindingResult result)
    {
        if(result.hasErrors())
            return "students/createStudentForm";

        Address address = new Address(studentForm.getCity(), studentForm.getStreet());

        Student student = new Student();
        student.setName(studentForm.getName());
        student.setAddress(address);

        studentService.join(student);
        return "redirect:/";
    }

    @GetMapping("/students")
    public String list(Model model)
    {
        model.addAttribute("students",  studentService.findStudents());
        return "students/studentList";
    }
}
