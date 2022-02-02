package mbti.mbtiwisdom.controller;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Board;
import mbti.mbtiwisdom.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping("/mbtis/v1")
    public List<Board> boardList(){
        return boardService.findAllBoard();
    }
}
