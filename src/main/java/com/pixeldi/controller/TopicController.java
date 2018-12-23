package com.pixeldi.controller;

import com.pixeldi.model.Employee;
import com.pixeldi.model.Topic;
import com.pixeldi.service.TopicService;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopics();
    }
    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
         topicService.addTopic(topic);
    }
    @GetMapping("/rxJava")
    public Observable<Employee> rxIndex(){
        List<Employee> list = new ArrayList<>();
        topicService.getAllTopics();
        Observable<Employee> observable = Observable.fromIterable(list);

        observable.subscribe(item -> System.out.println(item), error -> error.printStackTrace(),
                () -> System.out.println("Done"));

        Flowable.just("Hello world").subscribe(System.out::println);
        return observable;
    }




}
