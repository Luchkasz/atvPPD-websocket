package br.com.helpusz.entities.Message;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

  List<Message> findByChatRoomId(String chatRoomId);
  
}
