package mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Admin on 21.05.2016.
 */

@Controller
public class HelloServlet {
    @RequestMapping("/welcome")
    public ModelAndView helloWorld(){
        return new ModelAndView("hello");
    }
}
