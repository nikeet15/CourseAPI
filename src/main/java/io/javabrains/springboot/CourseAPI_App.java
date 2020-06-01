package io.javabrains.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                  //this annotation tells springboot that it is a spring boot app
public class CourseAPI_App {

    //main method defined hence does no need servelet continer to run app
    public static void main(String[] args) {

        SpringApplication.run(CourseAPI_App.class, args);
    }
}
