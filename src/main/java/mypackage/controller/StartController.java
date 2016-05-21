package mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Admin on 22.04.2016.
 */
@Controller
@RequestMapping(name = "/sayHello")
public class StartController {
    @RequestMapping( method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Oleh";
    }
}
