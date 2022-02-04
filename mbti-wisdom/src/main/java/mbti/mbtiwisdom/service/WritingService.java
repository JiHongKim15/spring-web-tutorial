package mbti.mbtiwisdom.service;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Writing;
import mbti.mbtiwisdom.repository.WritingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WritingService {

    private WritingRepository repository;

    @Transactional
    public Writing write(Writing writing){
        return repository.save(writing);
    }
    @Transactional(readOnly = true)
    public Optional<Writing> getWritingById(Integer id){
        return repository.findById(id);
    }
    @Transactional(readOnly = true)
    public Optional<List<Writing>> getWritingListByBoardId(Integer boardId){
        return repository.findByBoardId(boardId);
    }
    @Transactional
    public void deleteWriting(Integer writingId){
        repository.deleteById(writingId);
    }

}
