package Williams.Sonoma.interview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @RequestMapping(value={"/"})
    public String index(HttpServletRequest request) {
        return "index";
    }

}