package com.dmb.ExampleOne.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {


    @RequestMapping(value = {"/","/login.html"} ,  method = RequestMethod.GET)
    public ModelAndView slash(){
        System.out.println("Index Controller Request");

        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("login.html");

        return modelAndView;
    }


    @RequestMapping(value = {"/welcome","/welcome.html"} ,  method = RequestMethod.GET)
    public ModelAndView welcome(){
        System.out.println("Index Controller Request");

        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("welcome.html");

        return modelAndView;
    }

    @RequestMapping(value = {"/register","/register.html"} ,  method = RequestMethod.GET)
    public ModelAndView register(){
        System.out.println("Index Controller Request");

        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("register.html");

        return modelAndView;
    }

//    @RequestMapping(value = {"/search","/search.html"}, method = RequestMethod.GET)
//    public ModelAndView search() {
//        System.out.println("Index controller search request");
//
//        ModelAndView modelAndView  = new ModelAndView();
//        modelAndView.setViewName("search.html");
//
//        return modelAndView;
//    }



}
