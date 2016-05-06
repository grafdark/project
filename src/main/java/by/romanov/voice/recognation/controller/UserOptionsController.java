package by.romanov.voice.recognation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by graf on 01.05.2016.
 */
@Controller
public class UserOptionsController {
    @RequestMapping(value = "/addUserSystemPage")
    public ModelAndView addUserSystemPage() throws IOException, InterruptedException {
        ModelAndView mv = new ModelAndView("admin/add_user_page");
        return mv;
    }
}
