package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICouseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    //para recibir la peticion
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
