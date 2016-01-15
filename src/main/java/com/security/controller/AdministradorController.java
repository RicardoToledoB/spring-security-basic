package com.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("administradorController")
public class AdministradorController {
    @RequestMapping("/admin01")
    public ModelAndView admin01(){
        ModelAndView mav=new ModelAndView("admin01");
        return mav;
    }
     @RequestMapping("/admin02")
    public ModelAndView admin02(){
        ModelAndView mav=new ModelAndView("admin02");
        return mav;
    }
    @RequestMapping("/admin03")
    public ModelAndView admin03(){
        ModelAndView mav=new ModelAndView("admin03");
        return mav;
    }
}
