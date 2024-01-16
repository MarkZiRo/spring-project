package project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.study.domain.Board.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
