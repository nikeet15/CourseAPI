package io.javabrains.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    /*
     JPA provides implementation by itself
     you just have to write the method name in a particular format
    */
    public List<Course> findAllByTopicId(String topicid);
}
