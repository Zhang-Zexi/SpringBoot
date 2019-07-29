package com.shi.interfacesss;

import com.shi.entity.Message;

import java.util.List;

public interface MessageRepository {

    List<Message> findAll();

    Message save(Message message);

    Message update(Message message);

    Message updateText(Message message);

    Message findMessage(Long id);

    Message deleteMessage(Long id);


}
