package mbti.mbtiwisdom.service;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Board;
import mbti.mbtiwisdom.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    private BoardRepository repository;

    @Transactional(readOnly = true)
    public List<Board> findAllBoard(){
        return repository.findAll();
    }
}
