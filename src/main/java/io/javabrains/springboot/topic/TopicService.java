package io.javabrains.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
// it is a Spring Buissness-service i.e. a singleton
// only one instance of it is need to be created

public class TopicService {

    @Autowired
    private TopicRepository topicRepo;

    private List<Topic> topics=  new ArrayList<>(Arrays.asList(new Topic("spring", "spring-framework", "desc"),
                new Topic("java", "core-java", "desc"),
                new Topic("javascript", "Javascript", "desc")));

    //Arrays.asList is immutable array
    //hence we just pass the immutable array to ArrayList which is mutable

    public List<Topic> getAllTopics(){

        List<Topic> topics= new ArrayList<>();
        topicRepo.findAll()
                .forEach(topics::add);

        return topics;
    }

    public Topic getTopic(String id) {
    /*
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
                return ts;
        }

        return null;
    */
        return topicRepo.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {

        topicRepo.save(topic);
    }

    public void updateTopic(String id, Topic t) {
    /*
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
            {
                ts.setName(t.getName());
                ts.setDescription(t.getDescription());
            }
        }
    */
        topicRepo.save(t);
    }

    public void deleteTopic(String id) {
    /*
        for(Topic ts : topics)
        {
            if(ts.getId().equals(id))
                topics.remove(ts);
        }
    */
        topicRepo.deleteById(id);
    }
}
