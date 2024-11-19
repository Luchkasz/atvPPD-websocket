package br.com.helpusz.entities.ChatRoom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {

  @Autowired
  private ChatRoomRepository chatRoomRepository;
  
  public List<ChatRoom> getAllChatRooms() {
    return chatRoomRepository.findAll();
  }

  public void joinChatRoom(String chatRoomId, String userId) {
    ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElseThrow(() -> new RuntimeException("Chat não encontrado"));
    chatRoom.getParticipants().add(userId);
    chatRoomRepository.save(chatRoom);
  }

  public ChatRoom createChatRoom(ChatRoom chatRoom) {
    return chatRoomRepository.save(chatRoom);
  }

  public void leaveChatRoom(String chatRoomId, String userId) {
    ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElseThrow(() -> new RuntimeException("Chat não encotrado"));
    chatRoom.getParticipants().remove(userId);
    chatRoomRepository.save(chatRoom);
  }
  
}
