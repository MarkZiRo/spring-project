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

//    public List<Grade> findAll(Gradestatus gradestatus)
//    {
//
//    }
}
