package com.saber.microservice.test1.controllers;

import com.saber.microservice.test1.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    private final RestTemplate restTemplate;

    public MessageController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<MessageDto> getMessageDto(){
        MessageDto messageDto =new MessageDto();
        String jokes= restTemplate.getForObject("https://api.chucknorris.io/jokes/random", String.class);
        messageDto.setMessage("Jokes ==> "+jokes);
        return ResponseEntity.ok(messageDto);
    }
}
