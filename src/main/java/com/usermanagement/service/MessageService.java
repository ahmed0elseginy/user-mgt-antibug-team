package com.usermanagement.service;

import com.usermanagement.model.activemq.PublishMessage;
import com.usermanagement.model.dto.request.PublishMessageDto;

public interface MessageService {

    public PublishMessage Mapping(PublishMessageDto messageDto);
}
