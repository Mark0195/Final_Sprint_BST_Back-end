package Database.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BController {
    @GetMapping(path = "/numbers")
    public String getNumbers() {
        return "numbers.html";
    }
}