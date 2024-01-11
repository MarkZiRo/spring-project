package project.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import project.study.domain.Subject.English;
import project.study.domain.Subject.Subject;
import project.study.service.SubjectService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectService subjectService;

    @GetMapping("/subjects/new")
    public String createForm(Model model)
    {
        model.addAttribute("form", new EnglishForm());
        return "subjects/createSubjectForm";
    }

    @PostMapping("/subjects/new")
    public String create(EnglishForm englishForm)
    {
        English english = new English();
        english.setId(englishForm.getId());
        english.setName(englishForm.getName());
        english.setScore(englishForm.getScore());
        english.setProfessor(englishForm.getProfessor());

        subjectService.saveSubject(english);
        return "redirect:/subjects";
    }

    @GetMapping("/subjects")
    public String list(Model model)
    {
        List<Subject> subjectList = subjectService.findSubjects();
        model.addAttribute("subjects", subjectList);
        return "subjects/subjectList";
    }

    @GetMapping("subjects/{itemId}/edit")
    public String updateSubjectForm(@PathVariable("itemId") Long itemId, Model model)
    {
        English english = (English)subjectService.findOne(itemId);

        EnglishForm englishForm = new EnglishForm();
        englishForm.setId(english.getId());
        englishForm.setName(english.getName());
        englishForm.setProfessor(englishForm.getProfessor());
        englishForm.setScore(englishForm.getScore());
        englishForm.setReport(englishForm.getReport());

        model.addAttribute("form", englishForm);
        return "subjects/updateSubjectForm";
    }

    @PostMapping("subjects/{itemId}/edit")
    public String updateSubject(@ModelAttribute("form") EnglishForm form)
    {
        English english = new English();
        english.setId(form.getId());
        english.setName(form.getName());
        english.setScore(form.getScore());
        english.setProfessor(form.getProfessor());
        english.setEngReport(form.getReport());

        subjectService.saveSubject(english);
        return "redirect:/subjects";
    }
}
