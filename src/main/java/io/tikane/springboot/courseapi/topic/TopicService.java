package io.tikane.springboot.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring","Spring Framework", "Spring Framework Description"),
            new Topic("java","Core java", "Core java Description"),
            new Topic("javascript","Javascript Framework", "Javascript Framework Description"),
            new Topic("C#","C# Framework","C# Framework Description"));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


}
