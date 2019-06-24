package com.controller;

/**
 * Created by Mikolaj on 26.02.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping(path="/")
    public String homePage() {
        return "index";
    }

}
