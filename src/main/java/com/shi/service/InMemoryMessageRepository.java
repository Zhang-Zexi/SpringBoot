package com.shi.service;

import com.shi.entity.Message;
import com.shi.interfacesss.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class InMemoryMessageRepository implements MessageRepository {
    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentHashMap<Long,Message> message = new ConcurrentHashMap<>();

    @Override
    public List<Message> findAll() {
        return new ArrayList<>(this.message.values());
    }

    @Override
    public Message save(Message message) {
        Long id = message.getId();
        if(id==null){
            id = counter.getAndIncrement();
            message.setId(id);
        }
        this.message.put(id,message);
        return message;
    }

    @Override
    public Message update(Message message) {
        this.message.put(message.getId(),message);
        return message;
    }

    @Override
    public Message updateText(Message message) {
        Message tmp = this.message.get(message.getId());
        tmp.setText(message.getText());
        this.message.put(message.getId(),tmp);
        return tmp;
    }

    @Override
    public Message findMessage(Long id) {
        return this.message.get(id);
    }

    @Override
    public Message deleteMessage(Long id) {
        return this.message.remove(id);
    }
}
