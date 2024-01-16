package project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.study.domain.Board.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {
    boolean existsByName(String name);
}
