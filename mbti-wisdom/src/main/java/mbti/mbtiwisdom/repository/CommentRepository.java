package mbti.mbtiwisdom.repository;

import mbti.mbtiwisdom.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Optional<List<Comment>> findByWritingId(Integer writingId);

}
