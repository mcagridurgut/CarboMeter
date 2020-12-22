package user;

import database.DatabaseConnection;
import others.*;
import java.util.ArrayList;

/**
 * normal user class 
 * @author Alper Mumcular, Uygar Onat Erol
 * @version 16.12.2020
 */ 
public class NormalUser extends User {
  
  private static ArrayList<NormalUser> allNormalUsers = new ArrayList<>();
  
  //instance data members
  private ArrayList<Report> reportsCompleted;
  private ArrayList<Challenge> challenges;
  private ArrayList<User> friends;
  //private ArrayList<Recommendations> recommendations;
  private String referenceCode;
  private double donations;
  
  //constructors
  public NormalUser( String username, String password, String email, String referenceCode ) {
    super(username, password, email);
    DatabaseConnection.createNewUser(username,email, password,0,0,0,0,0,1,"","",referenceCode,0);
    this.referenceCode = referenceCode;
    this.referral(referenceCode);
    this.reportsCompleted = new ArrayList<Report>();
    this.challenges = new ArrayList<Challenge>();
    //this.recommendations = new ArrayList<Recommendations>();
    this.donations = 0;
    allNormalUsers.add(this);
    allUsers.add(this);
  }
  
  //constructor
  public NormalUser( String username, String password, String email) {
    super(username, password, email);
    DatabaseConnection.createNewUser(username,email, password,0,0,0,0,0,1,"","","",0);
    this.referenceCode = "";
    this.reportsCompleted = new ArrayList<Report>();
    this.challenges = new ArrayList<Challenge>();
    //this.recommendations = new ArrayList<Recommendations>();
    this.donations = 0;
    allNormalUsers.add(this);
  }
  
  // getters
  public ArrayList<Report> getReports() {
    return this.reportsCompleted;
  }
  public ArrayList<Challenge> getChallenges() {
    return this.challenges;
  }
  //public ArrayList<Recommendations> getRecommendations() {
    //return this.recommendations;
  //}
  public ArrayList<User> getFriends() {
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
  }
  //public void setRecommendations( Recommendation r ) {
   //this.recommendations = r;
  //}
  
  //methods
  public void createReport() {
    Report newReport = new Report(true,true,true,true); // DEFAULT / PERSONALIZED
    for( Category c : newReport.getPersonalizedCategories() ){
      for(Question q : c.getQuestions() ) {
        c.updateScore( q );
      } 
    }
    reportsCompleted.add(newReport);
  }
  
  public void newChallenge( Challenge challenge ){
    challenges.add(challenge);
  }
  
  public void addFriend( User f ) {
    friends.add(f);
  }
  
  public void referral( String referenceCode ) {
    SuperUser.addToSuperUser( referenceCode, this );
  }
  
  public void challengeCompleted( Challenge c ) {
    c.challengeCompleted();
  }
  

}