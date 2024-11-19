package br.com.helpusz.entities.ChatRoom;

import java.util.List;

public interface ChatRoomService {

  ChatRoom createChatRoom(ChatRoom chatRoom);
  
  List<ChatRoom> getAllChatRooms();

  void joinChatRoom(String chatRoomId, String userId);

  void leaveChatRoom(String chatRoomId, String userId);
  
}
