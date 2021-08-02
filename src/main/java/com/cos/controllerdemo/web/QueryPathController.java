package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {
    @GetMapping("/chicken")
    public String chickenQuery(String type){
        return type+"배달갑니다.(쿼리스트링)";
    }
    @GetMapping("/chicken/{type}")
    public String chickenPath(@PathVariable String type){
        return type+"배달갑니다.(주소변수매핑)";

    }
}
