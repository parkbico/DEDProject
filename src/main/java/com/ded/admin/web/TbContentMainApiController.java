package com.ded.admin.web;

import com.ded.admin.service.tbContentMain.TbContentMainService;
import com.ded.admin.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
//Bean을 주입받는 방식 중 , 생성자로 Bean 객체를 받게 함
//final 이 선언된 모든 필드를 인자값으로 하는 생성자를 생성해줌
@RestController
public class TbContentMainApiController {
    private final TbContentMainService tbContentMainService;

//    @PostMapping("/api/v1/contentMain")
//    public Long save(@RequestBody PostsSaveRequestDto requestDto){
//        return tbContentMainService.save(requestDto);
//    }

}
