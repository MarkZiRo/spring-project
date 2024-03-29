package project.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.study.domain.Board.Dto.CommentDto;
import project.study.service.CommentService;

@Controller
@RequestMapping("article/{articleId}/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public String createComment(@PathVariable("articleId") Long articleId, @RequestParam("content") String content,
                                @RequestParam("password") String password)
    {
        commentService.createComment(articleId, new CommentDto(content,password));
        return String.format("redirect:/article/%d", articleId);
    }

    @PostMapping("{commentId}/delete")
    public String deleteComment(@PathVariable("articleId") Long articleId, @PathVariable("commentId") Long commentId,
                                @RequestParam("password") String password)
    {
        commentService.deleteComment(commentId,password);
        return String.format("redirect:/article/%d", articleId);
    }
}
