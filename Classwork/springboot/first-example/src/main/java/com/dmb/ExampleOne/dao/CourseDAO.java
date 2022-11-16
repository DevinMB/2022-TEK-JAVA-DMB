package com.dmb.ExampleOne.dao;

import com.dmb.ExampleOne.entitymodels.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDAO {

    /**
     * pulls all courses from the database
     * @return a list of ALL courses
     */
    List<Course> getAllCourses();



}
