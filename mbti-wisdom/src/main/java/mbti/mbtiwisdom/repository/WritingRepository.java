package mbti.mbtiwisdom.repository;

import mbti.mbtiwisdom.domain.Writing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WritingRepository extends JpaRepository<Writing, Integer> {
    List<Writing> findByBoardId(Integer boardId);
}
