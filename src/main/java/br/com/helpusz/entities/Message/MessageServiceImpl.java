package br.com.helpusz.entities.Message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

  @Autowired
  private MessageRepository messageRepository;
  
  @Override
  public Message createMessage(Message message) {
    return messageRepository.save(message);
  }

  public List<Message> getMessagesByChatRoom(String chatRoomId) {
    return messageRepository.findByChatRoomId(chatRoomId);
  }
  
}
