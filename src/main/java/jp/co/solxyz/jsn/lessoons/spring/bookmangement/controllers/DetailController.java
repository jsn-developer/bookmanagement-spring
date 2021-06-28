package jp.co.solxyz.jsn.lessoons.spring.bookmangement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {

    @GetMapping("/detail")
    public String get() {
        return "detail";
    }
}
