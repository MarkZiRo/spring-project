package project.study.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.study.domain.Subject.Subject;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SubejctRepository {

    private final EntityManager em;

    public void save(Subject subject)
    {
        if(subject.getId() == null)
        {
            em.persist(subject);
        }else
        {
            em.merge(subject);
        }
    }

    public Subject findOne(Long id)
    {
        return em.find(Subject.class, id);
    }

    public List<Subject> findAll()
    {
        return em.createQuery("select s from Subject s", Subject.class)
                .getResultList();
    }
}
