package com.SJ.groupchat.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.SJ.groupchat.model.Message;
import com.SJ.groupchat.service.MessageService;
@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
        MessageService messageService;
    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public Message sendMessage(@RequestBody Message message){
        return messageService.sendMessage(message);
    }

    @RequestMapping(value = "/receive",method = RequestMethod.GET)
    public List<Message> receiveMessage(){
        return messageService.getAllMessages();
    }


}
