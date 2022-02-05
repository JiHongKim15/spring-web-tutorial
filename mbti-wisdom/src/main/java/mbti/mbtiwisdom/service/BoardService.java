package mbti.mbtiwisdom.service;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Board;
import mbti.mbtiwisdom.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BoardService {

    private BoardRepository repository;

    @Transactional(readOnly = true)
    public List<Board> findAllBoard(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Board> findBoardById(Integer id){
        return repository.findById(id);
    }
}
