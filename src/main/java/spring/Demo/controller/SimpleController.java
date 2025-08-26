package spring.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {

    public void getSimple(){
        System.out.println("This is our simple API");
    }


}
