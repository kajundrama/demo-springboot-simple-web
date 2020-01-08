package me.kajundrama.demospringbootsimpleweb.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.printf("Hello Sp[ring Web");
        return "Hello Spring Web v0.0.3-SNAPSHOT";
    }

}
