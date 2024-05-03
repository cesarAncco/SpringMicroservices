package com.microservice.student.persistence;

import com.microservice.student.Entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    //@Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    //List<Student> findAllStudent(Long idCourse);

    List<Student> findAllByCourseId(Long idCourse);
}
