package project.study.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import project.study.domain.Student;
import project.study.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class StudentApiController {

    private final StudentService studentService;

    @GetMapping("/api/students")
    public Result student()
    {
        List<Student> findStuents = studentService.findStudents();
        List<StudentDto> collect = findStuents.stream().
                map(s -> new StudentDto(s.getName())).
                collect(Collectors.toList());

        return new Result(collect);
    }

    @Data
    @AllArgsConstructor
    static class Result<T>{
        private T data;
    }

    @Data
    @AllArgsConstructor
    static class StudentDto{
        private String name;
    }

    @PostMapping("/api/students")
    public CreateStudentResponse saveStudnet(@RequestBody @Validated CreateStudentRequest request)
    {
        Student student = new Student();
        student.setName(request.getName());

        Long id = studentService.join(student);
        return new CreateStudentResponse(id);
    }

    @PutMapping("/api/students/{id}")
    public UpdateMemberResponse updateStudent(@PathVariable("id") Long id,
                                              @RequestBody @Validated UpdateMemberRequest request)
    {
        studentService.update(id, request.getName());
        Student student = studentService.findOne(id);
        return new UpdateMemberResponse(student.getId(), student.getName());
    }

    @Data
    static class UpdateMemberRequest
    {
        private String name;
    }

    @Data
    @AllArgsConstructor
    static class UpdateMemberResponse
    {
        private Long id;
        private String name;
    }

    @Data
    static class CreateStudentRequest{
        private String name;
    }

    @Data
    static class CreateStudentResponse{
        private Long id;

        public CreateStudentResponse(Long id)
        {
            this.id = id;
        }
    }
}
