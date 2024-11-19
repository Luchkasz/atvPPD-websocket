package br.com.helpusz.entities.Message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/message")
public class MessageController {
  
  @Autowired
  private MessageService messageService;

  @PostMapping("/create")
  public Message createMessage(@RequestBody Message message) {
    return messageService.createMessage(message);
  }

  @GetMapping("/chatRoom/{chatRoomId}")
  public ResponseEntity<List<Message>> getMessagesByChatRoom(@PathVariable String chatRoomId) {
    List<Message> messages = messageService.getMessagesByChatRoom(chatRoomId);
    return ResponseEntity.ok(messages);
  }
  
}
