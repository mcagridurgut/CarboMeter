package Model;

/**
 * Report class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public class Report {
  
  public static final double CARBOPOINT_DEFAULT = 50;

  // instance data members
  private Category home, transportation, food, others;
  private String user;
  private double carbopoint;

  /**
   * constructor of Report class
   * @param user ---> username of the user
   * @param h ---> default or personalise for home category
   * @param t ---> default or personalise for transportation category
   * @param f ---> default or personalise for food category
   * @param o ---> default or personalise for others category
   */
  public Report( String user, boolean h, boolean t, boolean f, boolean o ) { // true means personalized category
    this.home = new Home (h);
    this.transportation = new Transportation(t);
    this.food = new Food(f);
    this.others = new Others(o);
    this.user = user;
    this.carbopoint = CARBOPOINT_DEFAULT;
  }

  /**
   * Sets the home category's score
   * @param score --> carbopoint score for home category
   */
  public void setHomeScore( double score ){
    this.home.updateScore(score);
  }

  /**
   * Sets the food category's score
   * @param score --> carbopoint score for food category
   */
  public void setFoodScore( double score ){
    this.food.updateScore(score);
  }

  /**
   * Sets the transportation category's score
   * @param score --> carbopoint score for transportation category
   */
  public void setTransportationScore( double score ){
    this.transportation.updateScore(score);
  }

  /**
   * Sets the others caregory's score
   * @param score --> carbopoint score for others category
   */
  public void setOthersScore( double score ){
    this.others.updateScore(score);
  }

  /**
   * Gets carbopoint score
   * @return carbopoint score
   */
  public double getScore() {
    return this.carbopoint;
  }

  /**
   * Gets carbopoint score for home category
   * @return home category's carbopoint score
   */
  public double getHomeScore() {
    return this.home.getScore();
  }
  /**
   * Gets carbopoint score for food category
   * @return food category's carbopoint score
   */
  public double getFoodScore() {
    return this.food.getScore();
  }
  /**
   * Gets carbopoint score for transportation category
   * @return transportation category's carbopoint score
   */
  public double getTransportScore() {
    return this.transportation.getScore();
  }
  /**
   * Gets carbopoint score for others category
   * @return others category's carbopoint score
   */
  public double getOthersScore() {
    return this.others.getScore();
  }
  /**
   * Gets the username of the user
   * @return username of the user
   */
  public String getUser() {
    return user;
  }

  /**
   * updates the carbopoint score
   */
  public void updateScore() {
    carbopoint = food.getScore()+transportation.getScore()+ others.getScore()+home.getScore();
  }
}