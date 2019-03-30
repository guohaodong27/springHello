package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hi")
public class HelloSpring {

    @RequestMapping("/say")
    public String Hello(Model model) {
        model.addAttribute("message", "hello GuoHaoDong");
        return "say";
    }
    @RequestMapping("/{name}")
    public String yourName(Model model, @PathVariable String name){
        model.addAttribute("name",name);
        return "say";
    }

}
