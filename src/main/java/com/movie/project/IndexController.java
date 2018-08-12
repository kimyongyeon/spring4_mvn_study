package com.movie.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model m) {
        m.addAttribute("name", "world");
        m.addAttribute("date", new Date());
        return "index";
    }
}
