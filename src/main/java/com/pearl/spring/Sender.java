package com.pearl.spring;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/sender")
    public void send(){

        rabbitTemplate.convertAndSend(RabbitMQConfig.topicExchangeName,"foo.bar","Hello from sender");
    }
}
