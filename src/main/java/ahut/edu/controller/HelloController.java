package ahut.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by newman on 2016/5/17.
 */
@Controller
public class HelloController {

    @RequestMapping({"/hello","/"})
    public String hello(String paramx, Model model){
        System.out.println(paramx);
        System.out.println("hot depolyment!!!");
        model.addAttribute("paramx",paramx);
        return "hello";
    }
}
