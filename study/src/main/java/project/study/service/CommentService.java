package project.study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.study.domain.Board.Article;
import project.study.domain.Board.Comment;
import project.study.domain.Board.Dto.CommentDto;
import project.study.repository.ArticleRepository;
import project.study.repository.CommentRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;

    public CommentDto createComment(Long articleId, CommentDto commentDto)
    {
        Article article = articleRepository.findById(articleId).orElseThrow();

        Comment comment = new Comment();
        comment.setArticle(article);
        comment.setContent(commentDto.getContent());
        comment.setPassword(commentDto.getPassword());
        return CommentDto.fromEntity(commentRepository.save(comment));
    }

    public void deleteComment(Long id, String password)
    {
        Comment comment = commentRepository.findById(id).orElseThrow();
        if(comment.getPassword().equals(password))
        {
            commentRepository.delete(comment);
        }
    }

}
