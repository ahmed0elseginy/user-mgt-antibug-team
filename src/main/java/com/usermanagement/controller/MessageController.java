package com.usermanagement.controller;

import com.usermanagement.model.dto.PublishMessageDto;
import com.usermanagement.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MessageController implements PublishMessageApi{

    private final JmsTemplate jmsTemplate;

    private final MessageService messageService;

    @Override
    public ResponseEntity<String> publishMessage(PublishMessageDto publishMessageDto) {
        jmsTemplate.convertAndSend("bridge-queue",messageService.Mapping(publishMessageDto));
        return new ResponseEntity<>("Message successfully sent to the queue.", HttpStatus.OK);
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return PublishMessageApi.super.getRequest();
    }
}
