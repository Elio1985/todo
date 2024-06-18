package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.todo.loginModel;

@Controller
@RequestMapping("/")
public class loginController {

    @GetMapping("/")
    public String displayLoginForm(Model model) {
        model.addAttribute("loginModel", new loginModel());
        return "login.html";
    }

    @PostMapping("/processLogin")
    public String processLogin(loginModel loginModel, Model model) {
        model.addAttribute("loginModel", loginModel);
        return "dashboard.html";
    }

    // @GetMapping("/signin.html")
    // public String displaySigninForm(Model model) {
    //     model.addAttribute(attributeName:"loginModel", new loginModel());
    //     return "signin.html";
    // }

}
