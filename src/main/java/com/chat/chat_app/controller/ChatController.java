package com.chat.chat_app.controller;

import com.chat.chat_app.modal.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/send-message")
    @SendTo("/topic/message")
    public ChatMessage send(ChatMessage chatMessage) {
        return chatMessage;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
