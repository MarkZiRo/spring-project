package project.study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.study.domain.Subject.Subject;
import project.study.repository.SubejctRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectService {

    private final SubejctRepository subejctRepository;

    @Transactional
    public void saveSubject(Subject subject)
    {
        subejctRepository.save(subject);
    }

    public List<Subject> findSubjects()
    {
        return subejctRepository.findAll();
    }

    public Subject findOne(Long subjectId)
    {
        return subejctRepository.findOne(subjectId);
    }
}
