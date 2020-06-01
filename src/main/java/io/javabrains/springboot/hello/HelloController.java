package io.javabrains.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// tells Spring to make this class a controller ie to give responses to requests

public class HelloController {

    @RequestMapping("/hello")
    //this method is called when user visits /hello URL GET Request

    public String sayHi(){
        return "Hi";
    }
}
