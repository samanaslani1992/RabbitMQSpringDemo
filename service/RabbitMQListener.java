package com.example.demorabbit.sample.service;

import com.example.demorabbit.sample.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener {


    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receiveMessage(final Email email) {
        System.out.println("Received message and deserialized to 'CustomMessage': " + email.toString());

    }
}