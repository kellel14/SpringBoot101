package springboot_101.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
}
