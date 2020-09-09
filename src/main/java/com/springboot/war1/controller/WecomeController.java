package com.springboot.war1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WecomeController {
    @GetMapping("/abc")
    public String welcome(Model model) {
        model.addAttribute("msg", "这是由服务器调用的web-ifo的jsp页面");
        return "welcome";
    }

}
