package br.com.helpusz.entities.Message;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
  
  @Id
  private String id;
  private String senderId;
  private String content;
  private String chatRoomId;
  private Date date;
  
  public Message(String senderId, String content, String chatRoomId, Date date) {
    this.senderId = senderId;
    this.content = content;
    this.chatRoomId = chatRoomId;
    this.date = date;
  }
  
}
