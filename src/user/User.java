package user;

import java.util.ArrayList;

/**
 * abstract user class 
 * @author Alper Mumcular, Uygar Onat Erol
 * @version 16.12.2020
 */ 
public abstract class User {

  public static ArrayList<User> allUsers = new ArrayList<User>();

  //instance data members
  private String username;
  private String password;
  private String email;
    
  //constructor
  public User( String username, String password, String email ) {
    this.username = username;
    this.password = password;
    this.email = email;
  } 
  
  //getters
  public String getUsername() {
    return this.username;
  }
  
  public String getPassword() {
    return this.password;
  }

  public String getEmail(){
    return this.email;
  }
  
  //needed setters
  public void setPassword( String p ) {
    this.password = p;
  }

  public void setEmail (String email) { this.email =email; }

  public void setUsername( String un ) {
    this.username = un;
  }
}