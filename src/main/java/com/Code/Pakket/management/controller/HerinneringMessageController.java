package com.Code.Pakket.management.controller;

import com.Code.Pakket.management.model.HerinneringMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class HerinneringMessageController {

    //Zodra er een bericht hier naartoe wordt gezonden, gaat dat bericht naar een topic d.m.v SendTo
    @MessageMapping("/message") // Dus doorgeven : /app/message
    @SendTo("/topic")
    public HerinneringMessage receiveMessage(@Payload HerinneringMessage message){
        //Berichtservice.create(message)
        return message;
    }

}
