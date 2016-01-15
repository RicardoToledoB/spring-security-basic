package com.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("ejecutivoController")
public class EjecutivoController {
     @RequestMapping("/ejecutive01")
    public ModelAndView ejecutive01(){
        ModelAndView mav=new ModelAndView("ejecutive01");
        return mav;
    }
     @RequestMapping("/ejecutive02")
    public ModelAndView ejecutive02(){
        ModelAndView mav=new ModelAndView("ejecutive02");
        return mav;
    }
    @RequestMapping("/ejecutive03")
    public ModelAndView ejecutive03(){
        ModelAndView mav=new ModelAndView("ejecutive03");
        return mav;
    }
}
