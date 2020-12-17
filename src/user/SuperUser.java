package user;

import others.*;
import java.util.ArrayList;

/**
 * super user class 
 * @author Alper Mumcular, Uygar Onat Erol
 * @version 16.12.2020
 */ 
 
public class SuperUser extends User {
  
  private static ArrayList<SuperUser> allSuperUsers = new ArrayList<SuperUser>();
  
  //instance data members
  private ArrayList<NormalUser> referralEnteredUsers;
  private String referralCode;
  private double totalDonations;
  private ArrayList<Challenge> challenges;
  
  //constructor
  public SuperUser( String username, String password, String email, String referenceCode ) {
    super(username, password, email);
    this.referralCode = referenceCode;
    this.totalDonations = 0;
    this.challenges = new ArrayList<Challenge>();
    this.referralEnteredUsers = new ArrayList<NormalUser>();
    allSuperUsers.add(this);
    allUsers.add(this);
  }
  
  //getters
  public String getReferralCode() {
    return this.referralCode;
  }
  public ArrayList<NormalUser> getUsers() {
    return this.referralEnteredUsers;
  }
  public double getTotalDonations() {
    return this.totalDonations;
  }
  public ArrayList<Challenge> getChallenges() {
    return this.challenges;
  }
  
  //setter
  public void setReferralCode( String newReferralCode ) {
    this.referralCode = newReferralCode;
  }
  
  //methods
  public void addUser( NormalUser user ){
    this.referralEnteredUsers.add(user);
  }
  public void kickUser( NormalUser user ) {
    for(int i=0; i < this.referralEnteredUsers.size(); i++ ) {
      if(this.referralEnteredUsers.get(i).getUsername() == user.getUsername()) {
        this.referralEnteredUsers.remove(i);
        break;
      }
    }
  }
  
  public void createNewReferralCode( String newCode ) {
    this.referralCode = newCode;
  }
  
  public void addChallenge( Challenge newChallenge ) {
    challenges.add(newChallenge);
    for(NormalUser user : referralEnteredUsers ) {
      user.newChallenge( newChallenge );
    }
  }
  
  public static boolean addToSuperUser( String code, NormalUser user ) {
    for( SuperUser u : allSuperUsers) {
      if( u.getReferralCode().equals(code) ) {
        u.addUser(user);
        return true;
      }
    }
    return false; //this referral code has not been taken by any super users
  }
}