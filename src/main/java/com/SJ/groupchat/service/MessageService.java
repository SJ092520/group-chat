package com.SJ.groupchat.service;

import com.SJ.groupchat.model.Message;
import com.SJ.groupchat.repository.MessageRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {

    @Autowired
        MessageRepo messageRepo;
    //CREATE
    public Message sendMessage(Message message){
        return messageRepo.save(message);
    }

    //READ
    public List<Message> getAllMessages(){
        System.out.println("Boo");
        return messageRepo.findAll();

    }
}
