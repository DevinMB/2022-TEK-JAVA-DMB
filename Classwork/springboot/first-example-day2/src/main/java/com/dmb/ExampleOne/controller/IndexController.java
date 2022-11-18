package com.dmb.ExampleOne.controller;


import com.dmb.ExampleOne.entitymodels.Course;
import com.dmb.ExampleOne.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class IndexController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = {"/", "/index", "/index.html"}, method = RequestMethod.GET)
    public ModelAndView slash(
            @RequestParam(required = false) String course,
            @RequestParam(required = false) String instructor) {
        System.out.println("Index Controller Request Search: " + course + " " + instructor);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");

        List<Course> courses = new ArrayList<>();

        courses = courseService.findByInstructorAndCourseName("%" + course + "%", "%" + instructor + "%");

        modelAndView.addObject("instructor", instructor);
        modelAndView.addObject("course", course);
        modelAndView.addObject("courses", courses);

        return modelAndView;
    }


    @RequestMapping(value = {"/course", "/course.html"}, method = RequestMethod.GET)
    public ModelAndView course() {
        log.debug("Index Controller Course Request Method");

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("course");

        return modelAndView;

    }

    @RequestMapping(value = {"/course", "/course.html"}, method = RequestMethod.POST)
    public ModelAndView addCourse(
            @RequestParam(value = "courseName") String courseName,
            @RequestParam(value = "instructorName") String instructorName
    ) {
        log.debug("Index Controller Course Submit Method");

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("course");

        modelAndView.addObject("instructorName", instructorName);
        modelAndView.addObject("courseName", courseName);


        Course c = new Course();
        c.setName(courseName);
        c.setInstructorName(instructorName);

        boolean valid = true;
        String result = "Fail";

        if(c.getName()==null || c.getName()==""){
            modelAndView.addObject("name_error","Name is blank, please provide a name.");
            valid = false;
        }
        if(c.getInstructorName()==null || c.getInstructorName()==""){
            modelAndView.addObject("instructor_error","Instructor is blank, please provide an instructor name.");
            valid = false;
        }
        if(valid){
            Course newCourse = courseService.save(c);
            boolean success = newCourse.getName() != null;
            if(success){
                result = "Success!";
            }
        }

        modelAndView.addObject("insert_status", result);


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
