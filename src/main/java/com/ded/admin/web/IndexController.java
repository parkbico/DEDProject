package com.ded.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //머스테치 스타터가 컨트롤러에서 문자열을 반환할 때 앞의 경로와 뒤의 파일 확장자는 자동으로 지정함
    //앞의 경로는 src/main/resources/templates 뒤의 확장자는 mustache
    // src/main/resources/templates/index.mustache 로 전환되어 View Resolver 가 처리함
    //View Resolver : URL 요청 결과를 전달할 타입과 값을 지정하는 관리자 격으로 볼 수 있음
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
