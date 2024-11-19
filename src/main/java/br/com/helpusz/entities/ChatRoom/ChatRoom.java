package br.com.helpusz.entities.ChatRoom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoom {
  
  @Id
  private String id;
  private String name;
  private List<String> participants = new ArrayList<>();
  
  public ChatRoom(String name) {
    this.name = name;
  }
  
  public ChatRoom(String name, List<String> participants) {
    this.name = name;
    this.participants = participants;
  }
  
}
