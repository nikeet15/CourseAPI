package io.javabrains.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getAllCourses(String topicid){

        List<Course> courses= new ArrayList<>();
        courseRepo.findAllByTopicId(topicid)
                .forEach(courses::add);

        return courses;
    }

    public Course getCourse(String id) {
        return courseRepo.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public void updateCourse(String id, Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }
}
