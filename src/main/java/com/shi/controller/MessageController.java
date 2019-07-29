package com.shi.controller;

import com.shi.entity.Message;
import com.shi.interfacesss.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(value = "/messages")
    public List<Message> list(){
        return messageRepository.findAll();
    }

    @PostMapping("/create")
    public  Message create(Message message){
        return this.messageRepository.save(message);
    }

    @PatchMapping(value = "/message/text")
    public Message updateTest(Message message){
        return this.messageRepository.updateText(message);
    }

    @GetMapping(value = "/message/{id}")
    public Message get(@PathVariable Long id){
        return this.messageRepository.findMessage(id);
    }

    @DeleteMapping(value = "/del/{id}")
    public void delete(@PathVariable Long id){
        this.messageRepository.deleteMessage(id);
    }
}
