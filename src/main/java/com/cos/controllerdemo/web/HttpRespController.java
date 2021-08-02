package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일리턴
public class HttpRespController {

    @GetMapping("/txt")
    public String txt(){
        return "a.txt";//일반정적파일은 resource/static 폴더내부가 디폴트 경로다
    }
    @GetMapping("/mus")
    public String mus(){
        return "b";//머스태치 템플릿 엔진 라이브러리등록 - templates 폴더안에 .mustach을 나두면 확장자 없이 파일명만 적으면 자동으로 찾아간다.
    }
    @GetMapping("/jsp")
    public String jsp(){
        return "c";//jsp 엔진사용: src/main/webapp 폴더가 디폴트 경로
    }
}
