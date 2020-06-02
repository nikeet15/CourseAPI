package io.javabrains.springboot.course;

import io.javabrains.springboot.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
// tell spring that this is the schema of table
// and store instances of this Class in rows
public class Course {

    @Id
    // primary key
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    //default constructor
    public Course()
    {}

    public Course(String id, String name, String description, String topicID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic= new Topic(topicID, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() { return topic; }

    public void setTopic(Topic topic) { this.topic = topic; }
}
