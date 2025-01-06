package com.usermanagement.consumer;

import com.usermanagement.model.activemq.UserMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger logger= LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "bridge-queue")
    public void  messageListener(UserMessage userMessage){

        System.out.println("Received message from Bridge Queue : " + userMessage.toString());

       //logger.info("Received message from Bridge Queue: {}", userMessage);


    }

}
