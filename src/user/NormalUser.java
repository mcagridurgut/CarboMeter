package user;

import database.DatabaseConnection;
import Model.*;
import java.util.ArrayList;

/**
 * normal user class 
 * @author Alper Mumcular, Uygar Onat Erol
 * @version 16.12.2020
 */ 
public class NormalUser extends User {

  private ArrayList<Report> reportsCompleted;
  private ArrayList<Challenge> challenges;
  private ArrayList<Report> friends;
  private String referenceCode;
  private double donations;


  //constructors
  public NormalUser( String username, String email, String password, String referenceCode)  {
    super(username, email, password);
    if ( !DatabaseConnection.isSuchUserExists(username) && !DatabaseConnection.isSuchEmailExists(email) ){
      DatabaseConnection.createNewUser(username,email, password,0,0,0,0,0,1,"","",referenceCode,0);
      this.referenceCode = referenceCode;
      this.reportsCompleted = new ArrayList<Report>();
      this.challenges = new ArrayList<Challenge>();
      this.donations = 0;
      allUsers.add(this);
    }
    else{
      this.setUsername("");
      this.setEmail("");
      this.setPassword("");
    }
  }
  public Report getCurrentReport(){

    Report friend = new Report( getUsername(), true, true, true, true);
    Object[] frnd = DatabaseConnection.select(getUsername());
    friend.setTransportationScore( (double)frnd[5] );
    friend.setHomeScore( (double)frnd[6] );
    friend.setFoodScore( (double)frnd[7] );
    friend.setOthersScore( (double)frnd[8] );
    friend.updateScore();
    return friend;
  }
  public Report getPreviousReport(){
    Report friend = new Report( getUsername(), true, true, true, true);
    Object[] frnd = DatabaseConnection.selectWithEmail(getEmail()).get(DatabaseConnection.selectWithEmail(getEmail()).size()-1);
    friend.setTransportationScore( (double)frnd[5] );
    friend.setHomeScore( (double)frnd[6] );
    friend.setFoodScore( (double)frnd[7] );
    friend.setOthersScore( (double)frnd[8] );
    friend.updateScore();
    return friend;
  }

  // getters
  public ArrayList<Report> getReports() {
    return this.reportsCompleted;
  }
  public ArrayList<Challenge> getChallenges() {
    return this.challenges;
  }
  public ArrayList<Report> getFriends() {
   return this.friends;
  }
  public String getReferenceCode() {
    return this.referenceCode;
  }
  public double getDonations() {
    return this.donations;
  }

  // setters
  public void setDonations( double x) {
    this.donations = x;
    DatabaseConnection.updateDonation(getUsername(),x);
  }
  public void setReports( ArrayList<Report> reports) {
    this.reportsCompleted = reports;
  }
  public void setFriends ( ArrayList<Report> friends){
    this.friends = friends;
  }
  public void setReferenceCode(String referenceCode){
    this.referenceCode = referenceCode;
  }

  public void createReport(double home, double transportation, double food, double others,boolean f1,boolean f2,boolean f3,boolean f4 ) {
    Report newReport = new Report(getUsername(),f1,f2,f3,f4); // DEFAULT / PERSONALIZED
    newReport.setFoodScore(food);
    newReport.setHomeScore(home);
    newReport.setOthersScore(others);
    newReport.setTransportationScore(transportation);
    DatabaseConnection.updateData( getUsername(), transportation,home,food,others );
    reportsCompleted.add(newReport);
  }


  public boolean addFriend( String name ) {
    if( DatabaseConnection.isSuchUserExists(name) && !isSuchFriendExists(name) ) {
      DatabaseConnection.addFriend(getUsername(), name);
      Report friend = new Report( name, true, true, true, true);
      Object[] frnd = DatabaseConnection.select(name);

      friend.setTransportationScore( (double)frnd[5] );
      friend.setHomeScore( (double)frnd[6] );
      friend.setFoodScore( (double)frnd[7] );
      friend.setOthersScore( (double)frnd[8] );
      friend.updateScore();
      friends.add(friend);
      return true;
    }
    return false;
  }

  private boolean isSuchFriendExists (String name) {
   if(friends!=null){
     for (Report friend : friends) {
      if (friend.getUser().equals(name))
        return true;
    }
  }
    return false;
  }

  public void challengeCompleted( Challenge c ) {
    c.challengeCompleted();
  }
  
  public void changePassword ( String password ){
    DatabaseConnection.changePassword(getUsername(),getPassword(),password);
    setPassword(password);
  }
}