package br.com.helpusz.entities.User;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  
  @Id
  private String id;
  private String name;

  public User(String name) {
    this.name = name;
  }
  
}
