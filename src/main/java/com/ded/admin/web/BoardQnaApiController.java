package com.ded.admin.web;

import com.ded.admin.domain.csQna.BoardQna;
import com.ded.admin.service.csQna.BoardQnaService;
import com.ded.admin.web.dto.BoardQnaSaveRequestDto;
import com.ded.admin.web.dto.BoardQnaUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
//Bean을 주입받는 방식 중 , 생성자로 Bean 객체를 받게 함
//final 이 선언된 모든 필드를 인자값으로 하는 생성자를 생성해줌
@RestController
public class BoardQnaApiController {
    private final BoardQnaService boardQnaService;

    @PostMapping("/api/v1/boardQna")
    public Long save(@RequestBody BoardQnaSaveRequestDto requestDto){
        return boardQnaService.save(requestDto);
    }

    @PutMapping("/api/v1/boardQna/{qnaSeq}")
    public Long update(@PathVariable Long qnaSeq , @RequestBody BoardQnaUpdateRequestDto requestDto){
        return boardQnaService.update( qnaSeq , requestDto);
    }
//
//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById(@PathVariable Long id){
//        return postsService.findById(id);
//    }
//
//    @DeleteMapping("/api/v1/posts/{id}")
//    public Long delete(@PathVariable Long id) {
//        postsService.delete(id);
//        return id;
//    }
}
