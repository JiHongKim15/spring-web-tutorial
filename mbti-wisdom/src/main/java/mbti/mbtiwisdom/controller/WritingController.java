package mbti.mbtiwisdom.controller;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.Writing;
import mbti.mbtiwisdom.service.WritingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class WritingController {

    private WritingService writingService;

    @PostMapping("/write/v1")
    public void write(@RequestBody Writing writing){
        writingService.write(writing);
    }
    @GetMapping("/writings/{id}/v1")
    public List<Writing> getWritingByBoardId(@PathVariable Integer id){
        return writingService.getWritingListByBoardId(id);
    }
}
