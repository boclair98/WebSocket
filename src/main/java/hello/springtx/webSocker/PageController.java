package hello.springtx.webSocker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home() {
        return "index"; // templates/index.html
    }
}
