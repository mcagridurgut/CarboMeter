package Model;

/**
 * Report class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public class Report {
  
  public static final double CARBOPOINT_DEFAULT = 50; // ????? can be changed

  // instance data members
  private Category home, transportation, food, others;
  private String user;
  private double carbopoint;
  
  public Report( String user, boolean h, boolean t, boolean f, boolean o ) { // true means personalized category
    this.home = new Home (h);
    this.transportation = new Transportation(t);
    this.food = new Food(f);
    this.others = new Others(o);
    this.user = user;
    this.carbopoint = CARBOPOINT_DEFAULT;
  }

  public void setHomeScore( double score ){
    this.home.updateScore(score);
  }


  public void setFoodScore( double score ){
    this.food.updateScore(score);
  }


  public void setTransportationScore( double score ){
    this.transportation.updateScore(score);
  }


  public void setOthersScore( double score ){
    this.others.updateScore(score);
  }

  
  public double getScore() {
    return this.carbopoint;
  }

  public String getUser() {
    return user;
  }

  public void updateScore() {
    carbopoint = food.getScore()+transportation.getScore()+ others.getScore()+home.getScore();
  }
}