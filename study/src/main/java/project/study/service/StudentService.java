package project.study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.Student;
import project.study.repository.StudentRepository;
import project.study.repository.StudentRepositoryJPA;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // 회원가입
    @Transactional
    public Long join(Student student)
    {
        validateDuplidateStudnet(student);
        studentRepository.save(student);
        return student.getId();
    }

    private void validateDuplidateStudnet(Student student)
    {
        // Exception
        List<Student> findStudents = studentRepository.findByName(student.getName());
        if(!findStudents.isEmpty())
        {
            throw new IllegalStateException("이미 있는 학생입니다.");
        }
    }


    // 회원 전체조회

    public List<Student> findStudents()
    {
        return studentRepository.findAll();
    }

    public Student findOne(Long studentId)
    {
        return studentRepository.findById(studentId).get();
    }

    @Transactional
    public void update(Long id, String name) {
        Student student = studentRepository.findById(id).get();
        student.setName(name);
    }
}
