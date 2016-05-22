package mypackage.controller;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import mypackage.model.Credentials;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Admin on 21.05.2016.
 */
@RestController
public class ApiController {

    @RequestMapping("/api/{name}")

    public @ResponseBody String  getHello(@PathVariable String name){

        return new Gson().toJson(new Credentials(name,"Dram"));
    }
}
