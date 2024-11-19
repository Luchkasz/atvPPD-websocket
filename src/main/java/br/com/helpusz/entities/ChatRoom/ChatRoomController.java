
package br.com.helpusz.entities.ChatRoom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatRoom")
public class ChatRoomController {
  
  @Autowired
  private ChatRoomService chatRoomService;

  @PostMapping("/create")
  public ResponseEntity<ChatRoom> createChatRoom(@RequestBody ChatRoom chatRoom) {
    ChatRoom createdChatRoom = chatRoomService.createChatRoom(chatRoom);
    return ResponseEntity.ok(createdChatRoom);
  }
  
  @GetMapping("/readAll")
  public ResponseEntity<List<ChatRoom>> getAllChatRooms() {
    List<ChatRoom> chatRooms = chatRoomService.getAllChatRooms();
    return ResponseEntity.ok(chatRooms);
  }

  @PostMapping("/{chatRoomId}/join")
  public ResponseEntity<Void> joinChatRoom(@PathVariable String chatRoomId, @RequestParam String userId) {
    chatRoomService.joinChatRoom(chatRoomId, userId);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/{chatRoomId}/leave")
  public ResponseEntity<Void> leaveChatRoom(@PathVariable String chatRoomId, @RequestParam String userId) {
    chatRoomService.leaveChatRoom(chatRoomId, userId);
    return ResponseEntity.ok().build();
  }
  
}
