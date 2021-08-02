package com.cos.controllerdemo.web;

import com.cos.controllerdemo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResponseJsonController {

    @GetMapping("/resp/json")
    public String respJson(){
        return "{\"username\":\"cos\"}";
    }
    @GetMapping("/resp/json/object")
    public String respJsonObject(){
        User user = new User();
        user.setUsername("홍길동");

        String data="{\"username\":\""+user.getUsername()+"\"}";
        return data;
    }
    @GetMapping("/resp/json/javaobject")
    public User respJsonJavaObject(){
        User user = new User();
        user.setUsername("홍길동");
        return user;//messageconvert가 자동으로 javaobject를 json로 변경해서 통신해준다.
                    //@RestController일때만 messageconvert가 작동한다
    }
}
