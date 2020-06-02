package io.javabrains.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    {
        // this list of object gets automatically converted to JSON
        // as it is a REST Controller

        return ts.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {   // tells spring that String passed in parameter is actually a variable in URL

        return ts.getTopic(id);
    }


}