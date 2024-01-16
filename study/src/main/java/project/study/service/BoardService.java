package project.study.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.templateresolver.ITemplateResolver;
import project.study.domain.Board.Board;
import project.study.domain.Board.Dto.BoardDto;
import project.study.repository.BoardRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    private static final String[] basicBoardNames={
            "자유 게시판",
            "개발 게시판",
            "게임 게시판",
            "유머 게시판"
    };

    public BoardService(BoardRepository boardRepository)
    {
        this.boardRepository = boardRepository;
        for(String boardName : basicBoardNames)
        {
            if(!this.boardRepository.existsByName(boardName))
            {
                Board board = new Board();
                board.setName(boardName);
                this.boardRepository.save(board);
            }
        }
    }

    public List<BoardDto> readAll()
    {
        List<BoardDto> boardDtoList = new ArrayList<>();
        for (Board board : boardRepository.findAll()) {
            boardDtoList.add(BoardDto.fromEntity(board));
        }
        return boardDtoList;
    }

    public BoardDto read(Long boardId)
    {
        return BoardDto.fromEntity(boardRepository.findById(boardId).orElseThrow());
    }
}
