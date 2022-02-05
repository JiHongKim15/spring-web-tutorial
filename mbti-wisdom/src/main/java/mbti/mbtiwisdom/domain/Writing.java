package mbti.mbtiwisdom.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Writing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer writingId;
    private String writingSubject;
    private String writingContent;
    private Integer boardId;
    private String writerId;
    private Integer hits;
    private LocalDateTime createTime;
}
