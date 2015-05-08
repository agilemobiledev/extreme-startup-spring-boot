package de.britter.extremestartup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExtremeStartupController {

    @RequestMapping("/")
    @ResponseBody
    public String handleRequest(@RequestParam("q") String q) {
        System.out.println(q);
        return "";
    }
}
