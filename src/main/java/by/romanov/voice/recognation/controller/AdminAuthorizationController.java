package by.romanov.voice.recognation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by graf on 30.04.2016.
 */
@Controller
public class AdminAuthorizationController {

    @RequestMapping(value = "/homepage")
    public ModelAndView home() throws IOException, InterruptedException {
        ModelAndView mv = new ModelAndView("homepage");
        return mv;
    }

    @RequestMapping(value = "/fail2login", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
        model.addAttribute("error", "Ќеправильное им€ пользовател€ или пароль");
        return "login";
    }

    @RequestMapping(value = "/loginPage")
    public ModelAndView loginPage() throws IOException {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/homepage_user")
    public ModelAndView listNewsHome() throws IOException {
        ModelAndView mv = new ModelAndView("homepage");
        return mv;
    }
}
