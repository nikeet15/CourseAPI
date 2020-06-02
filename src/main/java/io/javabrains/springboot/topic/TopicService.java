package io.javabrains.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
// it is a Spring Buissness service i.e. a singleton
// only one instance of it is need to be created

public class TopicService {

    private List<Topic> topics=  new ArrayList<>(Arrays.asList(new Topic("spring", "spring-framework", "desc"),
                new Topic("java", "core-java", "desc"),
                new Topic("javascript", "Javascript", "desc")));

    //Arrays.asList is immutable array
    //hence we just pass the immutable array to ArrayList which is mutable

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id) {
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
                return ts;
        }

        return null;
    }

    public void addTopic(Topic t) {
        topics.add(t);
    }

    public void updateTopic(String id, Topic t) {
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
            {
                ts.setName(t.getName());
                ts.setDescription(t.getDescription());
            }
        }
    }

    public void deleteTopic(String id) {
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
                topics.remove(ts);
        }
    }
}
