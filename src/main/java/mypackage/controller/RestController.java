package mypackage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Admin on 21.05.2016.
 */
@org.springframework.web.bind.annotation.RestController

@RequestMapping("api")
public class RestController {

    @RequestMapping(method= RequestMethod.GET)

    public @ResponseBody String getHello(){
        JSO
        return "Hello from api";
    }
}
