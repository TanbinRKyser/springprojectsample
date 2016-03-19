package com.mitul.controller;

import com.mitul.dao.homdao;
import com.mitul.model.logininfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Mitul on 18-Mar-16.
 */
@Controller
public class newHomeController {
    @Autowired
    private homdao hom;

//    List<logininfo> posts = hom.findAllUsers();

    @RequestMapping(value = "/test2")
    public String name(Model map){

        List<logininfo> posts = hom.findAllUsers();
        map.addAttribute("log2",posts);

        return "test";
    }

    @RequestMapping(value = "/newpost",method = RequestMethod.GET)
    public String showNewPost(HttpSession session){
        return "newPost";
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submitNewPost(@RequestParam String username, @RequestParam String password,
                                Model model, HttpSession session){



        logininfo log = new logininfo();

        log.setUsername(username);
        log.setPassword(password);
        int i = hom.insertPost(log);

        if(i >=1) {
            return "index";
        }
        else
            return "error";
    }

}
