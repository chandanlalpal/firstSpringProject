package spring.Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {
@GetMapping("/simple1")
    public String  getSimple(){
        System.out.println("This is our simple API");
        return "This is our simple API";
    }


}
