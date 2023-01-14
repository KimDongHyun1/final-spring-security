package io.security.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("loginPage")
    public String loginPage() {
        return "loginPage";
    }


    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("login_proc")
    public String login_proc() {
        return "login_proc";
    }


}
