package com.mitul.controller;

import com.mitul.dao.homdao;
import com.mitul.model.logininfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
