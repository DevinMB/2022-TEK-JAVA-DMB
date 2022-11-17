package com.dmb.ExampleOne.controller;


import com.dmb.ExampleOne.entitymodels.Course;
import com.dmb.ExampleOne.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = {"/","/index","/index.html"} ,  method = RequestMethod.GET)
    public ModelAndView slash(
            @RequestParam(required = false) String course,
            @RequestParam(required = false) String instructor)
            {
        System.out.println("Index Controller Request Search: "+ course + " " + instructor);

        ModelAndView modelAndView  = new ModelAndView();

        modelAndView.setViewName("index");

        List<Course> courses = new ArrayList<>();

        courses = courseService.findByInstructorAndCourseName("%"+course+"%","%"+instructor+"%");

        modelAndView.addObject("instructor",instructor);
        modelAndView.addObject("course",course);
        modelAndView.addObject("courses",courses);

        return modelAndView;
    }


//    @RequestMapping(value = {"/welcome","/welcome.html"} ,  method = RequestMethod.GET)
//    public ModelAndView welcome(){
//        System.out.println("Index Controller Request");
//
//        ModelAndView modelAndView  = new ModelAndView();
//        modelAndView.setViewName("welcome");
//
//        return modelAndView;
//    }
//
//    @RequestMapping(value = {"/register","/register.html"} ,  method = RequestMethod.GET)
//    public ModelAndView register(){
//        System.out.println("Index Controller Request");
//
//        ModelAndView modelAndView  = new ModelAndView();
//        modelAndView.setViewName("register");
//
//        return modelAndView;
//    }

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
