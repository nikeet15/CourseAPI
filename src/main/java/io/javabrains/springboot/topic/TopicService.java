package io.javabrains.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
// it is a Spring Buissness service i.e. a singleton
// only one instance of it is need to be created

public class TopicService {

    private List<Topic> topics=  Arrays.asList(new Topic("spring", "spring-framework", "desc"),
                new Topic("java", "core-java", "desc"),
                new Topic("javascript", "Javascript", "desc"));

    public List<Topic> getAllTopics(){
        return topics;
    }

}
