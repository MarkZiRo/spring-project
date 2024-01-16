package project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.study.domain.Board.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
