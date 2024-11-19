package br.com.helpusz.entities.Message;

import java.util.List;

public interface MessageService {

  Message createMessage(Message message);

  List<Message> getMessagesByChatRoom(String chatRoomId);
  
}
