package com.cos.controllerdemo.web;

import com.cos.controllerdemo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpBodyController {

    private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

    @PostMapping("/body1")
    public String xwwwformurlencoded(String username){
        log.info(username);
        return "key=value 요청됨";
    }
    @PostMapping("/body2")
    public String plaintext(@RequestBody String data){
        log.info(data);
        return "plain/text 전송됨";
    }
    @PostMapping("/body3")
    public String applicationjson(@RequestBody String data){
        log.info(data);
        return  "json전송옴";
    }
    @PostMapping("/body4")
    public String applicationjsonToObject(@RequestBody User user){
        log.info(user.getUsername());
        return  "json전송옴";
    }
}
