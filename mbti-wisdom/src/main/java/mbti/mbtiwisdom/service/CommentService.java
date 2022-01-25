package mbti.mbtiwisdom.service;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Comment;
import mbti.mbtiwisdom.repository.CommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentRepository repository;

    @Transactional
    public Comment comment(Comment comment){
        return repository.save(comment);
    }
    @Transactional(readOnly = true)
    public Optional<List<Comment>> getCommentListByWritingId(Integer writingId){
        return repository.findByWritingId(writingId);
    }
    @Transactional
    public void deleteComment(Integer commentId){
        repository.deleteById(commentId);
    }
}
