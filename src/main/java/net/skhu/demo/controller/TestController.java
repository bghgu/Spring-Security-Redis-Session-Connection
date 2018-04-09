package net.skhu.demo.controller;

import net.skhu.demo.domain.USER;
import net.skhu.demo.utils.ContextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ds on 2018-03-26.
 */

@Controller
public class TestController {

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("main")
    public String main(Model model) {
        model.addAttribute("user", (USER) ContextUtils.getAttrFromSession("login"));
        return "main";
    }

    @GetMapping("error")
    public String error() {
        return "error";
    }
}
