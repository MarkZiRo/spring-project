package project.study.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.study.domain.Grade;
import project.study.domain.Gradestatus;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GradeRepository {

    private final EntityManager em;

    public void save(Grade grade)
    {
        em.persist(grade);
    }

    public Grade findOne(Long id)
    {
        return em.find(Grade.class, id);
    }

    public List<Grade> finalAllWithScholarship() {
        return em.createQuery(
                "select g from Grade g"+
                        " join fetch g.student st"+
                        " join fetch g.scholarship s", Grade.class
        ).getResultList();
    }

    public List<Grade> findAll() {
        return em.createQuery(
                "select g from Grade  g" +
                         " join fetch g.student s" +
                        " join fetch g.scholarship sh"+
                        " join fetch g.reportCardList rc"+
                        " join fetch  rc.subject su", Grade.class)
                .getResultList();
    }
}
