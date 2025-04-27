package com.usermanagement.service.implementation;

import com.usermanagement.mapper.MessageMapper;
import com.usermanagement.model.activemq.PublishMessage;
import com.usermanagement.model.dto.request.PublishMessageDto;
import com.usermanagement.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageImplementation implements MessageService {
    private final MessageMapper messageMapper;
    public PublishMessage Mapping(PublishMessageDto messageDto) {
        return messageMapper.publishMessageDtoMapToPublishMessage(messageDto);
    }
}
