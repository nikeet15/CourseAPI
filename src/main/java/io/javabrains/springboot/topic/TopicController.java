package io.javabrains.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        // this list of object gets automatically converted to JSON
        // as it is a REST Controller

        return Arrays.asList(new Topic("spring", "spring-framework", "desc"),
                new Topic("java", "core-java", "desc"),
                new Topic("javascript", "Javascript", "desc")
        );
    }

}