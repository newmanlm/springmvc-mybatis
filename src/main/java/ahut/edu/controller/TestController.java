package ahut.edu.controller;

import ahut.edu.entity.User;
import ahut.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by newman on 2016/5/25.
 */
@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "user")
    public String User( Model model) {
        User user = userService.getUserById("admin");
        System.out.println("name：" + user.getXm());
        model.addAttribute(user);
        return "user";
    }
}
