package io.javabrains.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TopicController {

    @Autowired
    // telling Spring that this class object has dependency on TopicService
    // registers this instance with the only(single) instance of TopicService instance
    // which is instantiated before it

    private TopicService ts;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {   // map this method that is a GET request on "/topics"
        // this list of object gets automatically converted to JSON
        // as it is a REST Controller

        return ts.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {   // tells spring that String passed in parameter is actually a variable in URL

        return ts.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    // map this method that is a POST request on "/topics"
    public void addTopic(@RequestBody Topic t){

        ts.addTopic(t);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    // map this method that is a POST request on "/topics"
    public void updateTopic(@RequestBody Topic t, @PathVariable String id){

        ts.updateTopic(id, t);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    // map this method that is a DELETE request on "/topics"
    public void deleteTopic(@PathVariable String id){

        ts.deleteTopic(id);
    }


}