package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller//File을 응답하는 컨틀롤러
@RestController//Data 응답컨트롤러(클라이언트가 핸드폰이면 data)
public class HttpController {

    @GetMapping("/get")
    public String get(){
        return "<h1>get 요청됨<h1>";
    }
    @PostMapping("/post")
    public String post(){
        return "post 요청됨";

    }

    @PutMapping("/put")
    public String put(){
        return "put 요청됨";

    }
    @DeleteMapping("/delete")
    public String delete(){
        return "delete 요청됨";

    }
}
