package others;

import question.*;
import user.*;
import java.util.ArrayList;

/**
 * Report class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public class Report {
  
  public static final double CARBOPOINT_DEFAULT = 50; // ????? can be changed

  // instance data members
  private Category home, transportation, food, others;
  private double carbopoint;
  
  public Report( boolean h, boolean t, boolean f, boolean o ) { // true means personalized category
    personalizeCategories(h, t, f, o);
    this.carbopoint = CARBOPOINT_DEFAULT;
  }
  
  public void personalizeCategories( boolean h, boolean t, boolean f, boolean o ) {
    if(h) {
      this.home = new Home();
      home.getQuestions();
    }
    if(t) {
      this.transportation = new Transportation();
      transportation.getQuestions();
    }
    if(f) {
      this.food = new Food();
      food.getQuestions();
    }
    if(o) {
      this.others = new Others();
      others.getQuestions();
    }
  }
  
  public ArrayList<Category> getPersonalizedCategories() {
    ArrayList<Category> personalized;
    if(home != null) 
      personalized.add(home);
    if(transportation != null) 
      personalized.add(transportation);
    if(food != null) 
      personalized.add(food);
    if(others != null) 
      personalized.add(others);
    
    return personalized;
  }
  
  public double getScore() {
    return this.carbopoint;
  }
  
  public void updateScore(Category c) {
    carbopoint = (4 * carbopoint - c.getDefault() + c.getScore()) / 4;
  }
}