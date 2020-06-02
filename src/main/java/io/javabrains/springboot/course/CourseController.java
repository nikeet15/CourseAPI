package io.javabrains.springboot.course;

import io.javabrains.springboot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService cs;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return cs.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicid}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return cs.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses")
    public void addCourse(@RequestBody Course c, @PathVariable String topicid){

        c.setTopic(new Topic(topicid, "", ""));
        cs.addCourse(c);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicid}/courses/{id}")
    public void updateCourse(@RequestBody Course c, @PathVariable String id, @PathVariable String topicid){

        c.setTopic(new Topic(topicid, "", ""));
        cs.updateCourse(id, c);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicid}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        cs.deleteCourse(id);
    }


}