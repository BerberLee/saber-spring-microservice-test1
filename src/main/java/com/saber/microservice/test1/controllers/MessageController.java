package com.saber.microservice.test1.controllers;

import com.saber.microservice.test1.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<MessageDto> getMessageDto(){
        MessageDto messageDto =new MessageDto();
        messageDto.setMessage("Welcome To Spring MicroService");
        return ResponseEntity.ok(messageDto);
    }
}
