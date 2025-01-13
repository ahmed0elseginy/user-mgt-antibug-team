package com.usermanagement.consumer;

import com.usermanagement.model.activemq.PublishMessage;
import com.usermanagement.model.dto.PublishMessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger logger= LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "bridge-queue")
    public void  messageListener(PublishMessage message){

        System.out.println("Received message from Bridge Queue : " + message.toString());

       //logger.info("Received message from Bridge Queue: {}", userMessage);


    }

}
