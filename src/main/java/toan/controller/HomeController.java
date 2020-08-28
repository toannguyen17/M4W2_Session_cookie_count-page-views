package toan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import toan.model.Visitor;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("visitor")
public class HomeController {

    @GetMapping("/")
    public String doGet(@ModelAttribute("visitor") Visitor visitor){
//        httpSession.setAttribute("visitor", visitor);
        visitor.plus();
        return "index";
    }

    @ModelAttribute("visitor")
    public Visitor getVisitor(){
        return new Visitor();
    }
}
