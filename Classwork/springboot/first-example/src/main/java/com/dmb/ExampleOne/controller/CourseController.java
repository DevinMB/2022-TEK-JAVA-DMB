package com.dmb.ExampleOne.controller;

import com.dmb.ExampleOne.entitymodels.Course;
import com.dmb.ExampleOne.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = {"/courses"} ,  method = RequestMethod.GET)
    public String getAllCourses(){
        System.out.println("Course Controller Request");

//        ModelAndView modelAndView  = new ModelAndView();
//        modelAndView.setViewName("login.html");


        List<Course> courseList = courseService.findAll();

        String s = courseList.get(0).getCName();

        return s;
    }





}
