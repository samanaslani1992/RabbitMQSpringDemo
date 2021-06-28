package com.example.demorabbit.sample.controller;


import com.example.demorabbit.sample.service.RabbitMQSender;
import com.example.demorabbit.sample.model.Email;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PController {

    final RabbitMQSender rabbitMQSender;

    public PController(RabbitMQSender rabbitMQSender) {
        this.rabbitMQSender = rabbitMQSender;
    }


    @GetMapping(value = "/producer")
    public String producer() {


        rabbitMQSender.send(new Email("address", "content"));

        return "Message sent to the RabbitMQ Successfully";
    }

}