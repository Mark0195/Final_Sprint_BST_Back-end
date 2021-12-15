package Database.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BController {
    @GetMapping(path = "/main")
    public String getMain() {
        return "main.html";
    }
}