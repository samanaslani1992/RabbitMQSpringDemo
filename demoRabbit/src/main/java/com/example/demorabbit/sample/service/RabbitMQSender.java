package com.example.demorabbit.sample.service;

import com.example.demorabbit.sample.model.Email;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQSender {

    private final AmqpTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public RabbitMQSender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(Email email) {
        rabbitTemplate.convertAndSend(exchange, routingkey, email);
        System.out.println("Send msg = " + email);

    }
}