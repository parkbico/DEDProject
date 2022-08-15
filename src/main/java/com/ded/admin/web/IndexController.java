package com.ded.admin.web;

import com.ded.admin.service.posts.PostsService;
import com.ded.admin.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    //머스테치 스타터가 컨트롤러에서 문자열을 반환할 때 앞의 경로와 뒤의 파일 확장자는 자동으로 지정함
    //앞의 경로는 src/main/resources/templates 뒤의 확장자는 mustache
    // src/main/resources/templates/index.mustache 로 전환되어 View Resolver 가 처리함
    //View Resolver : URL 요청 결과를 전달할 타입과 값을 지정하는 관리자 격으로 볼 수 있음

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){ //model : 서버 템플릿 엔진에서 사용할 수 있는 객체를 저장할 수 있습니다.
        //여기에서는 postsService.findAllDesc() 로 가져온 결과를 posts 로 index.mustache에 전달합니다.
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

}
