package project.study.domain.Board.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import project.study.domain.Board.Article;
import project.study.domain.Board.Board;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    @Setter
    private String name;
    private final List<ArticleDto> articles = new ArrayList<>();

    public BoardDto(String name) {
        this.name = name;
    }

    public static BoardDto fromEntity(Board entity) {
        BoardDto dto = new BoardDto();
        dto.id = entity.getId();
        dto.name = entity.getName();
        for (Article article: entity.getArticleList()) {
            dto.articles.add(ArticleDto.fromEntity(article));
        }
        return dto;
    }
}
