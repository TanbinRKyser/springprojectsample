package com.mitul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mitul on 18-Mar-16.
 */
@Controller
public class homecontroller {
    @RequestMapping(value = "/")
    public String test()
    {
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test2()
    {
        return "test";
    }
}
