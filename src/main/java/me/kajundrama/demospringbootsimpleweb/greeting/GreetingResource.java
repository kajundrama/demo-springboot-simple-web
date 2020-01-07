package me.kajundrama.springbootwebexample.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingResource {

    @GetMapping("/greeting")
    public String greeting() {
        return "Greeting Spring Web";
    }

}
