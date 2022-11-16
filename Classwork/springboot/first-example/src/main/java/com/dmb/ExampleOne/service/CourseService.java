package com.dmb.ExampleOne.service;

import com.dmb.ExampleOne.dao.CourseDAO;
import com.dmb.ExampleOne.entitymodels.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Repository
public interface CourseService extends JpaRepository<Course, Long> {



    @Query("SELECT c FROM Course c")
    public List<Course> findAll();

}
