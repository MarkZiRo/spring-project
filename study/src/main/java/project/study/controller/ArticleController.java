package project.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.study.domain.Board.Dto.ArticleDto;
import project.study.service.ArticleService;
import project.study.service.BoardService;

@Controller
@RequiredArgsConstructor
public class ArticleController {

    private final BoardService boardService;
    private final ArticleService articleService;

    @GetMapping("article/new")
    public String newArticle(Model model)
    {
        model.addAttribute("boards", boardService.readAll());
        return "article/new";
    }

    @PostMapping("article")
    public String createArticle(@RequestParam("title") String title,
                                @RequestParam("content") String content,
                                @RequestParam("password") String password,
                                @RequestParam("board-id") Long boardId)
    {
        Long id = articleService.create(boardId, new ArticleDto(title, content, password)).getId();
        return String.format("redirect:/article/%d", id);
    }

    @GetMapping("article/{id}")
    public String readArticle(@PathVariable("id") Long id, Model model)
    {
        model.addAttribute("article", articleService.readArticle(id));
        return "article/read";
    }

    @GetMapping("article/{id}/edit")
    public String editArticle(@PathVariable("id") Long id, Model model)
    {
        model.addAttribute("article", articleService.readArticle(id));
        return "article/edit";
    }

    @PostMapping("article/{id}/update")
    public String updateArticle(@PathVariable("id") Long id, @RequestParam("title") String title,
                                @RequestParam("content") String content, @RequestParam("password") String password)
    {
        articleService.update(id, new ArticleDto(title, content, password));
        return String.format("redirect:/article/%d", id);
    }

    @PostMapping("article/{id}/delete")
    public String deleteArticle(@PathVariable("id") Long id, @RequestParam("password") String password)
    {
        articleService.delete(id, password);
        return "redirect:/board";
    }


}
