package project.study.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.study.domain.Student;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryJPA {

    private final EntityManager em;

    public void save(Student student)
    {
        em.persist(student);
    }

    public Student findOne(Long id)
    {
        return em.find(Student.class, id);
    }

    public List<Student> findAll()
    {
        return  em.createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    public List<Student> findByName(String name)
    {
        return em.createQuery("select s from Student s where s.name = :name", Student.class)
                .setParameter("name", name)
                .getResultList();
    }
}
