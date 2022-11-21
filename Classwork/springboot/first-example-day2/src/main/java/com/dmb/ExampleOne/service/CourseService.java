package com.dmb.ExampleOne.service;

import com.dmb.ExampleOne.entitymodels.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
public interface CourseService extends JpaRepository<Course, Long> {


//This should be called a Course DAO interface
    @Query("SELECT c FROM Course c")
    public List<Course> findAll();

    @Query("SELECT c FROM Course c WHERE c.name like :search")
    public List<Course> findByName(String search);

    @Query("SELECT c FROM Course c WHERE c.name like :search")
    public List<Course> findByInstructorName(String search);

    @Query("SELECT c from Course c WHERE c.name like :search AND c.instructorName like :instructor")
    public List<Course> findByInstructorAndCourseName(String search, String instructor);

    public List<Course>  findByNameContainingIgnoreCaseOrderByNameDesc(String search);

    @Override
    <S extends Course> S save(S entity);


    Course findById(Integer id);

    //    @Modifying
//    @Query(value = "insert into Course (name,instructorName) VALUES (:name,:instructorName)", nativeQuery = true)
//    @Transactional
//    void addCourse(@Param("name") String courseName, @Param("instructorName") String instructorName);

}
