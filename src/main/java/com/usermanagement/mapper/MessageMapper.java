package com.usermanagement.mapper;

import com.usermanagement.model.activemq.PublishMessage;
import com.usermanagement.model.dto.request.PublishMessageDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    PublishMessage publishMessageDtoMapToPublishMessage(PublishMessageDto message);
}
