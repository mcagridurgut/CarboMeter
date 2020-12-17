package others;

import java.util.ArrayList;
import question.*;
import user.*;
/**
 * Categories class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public abstract class Category {
  
  private static final int DEFAULT = 50; ///// ?????
  
  //data members
  private ArrayList<Question> questions;
  private double score;
  
  public Category() {
    questions = new ArrayList<Question>();
    score = DEFAULT;
  }
  
  public Question[] getQuestions() {
    return this.questions;
  }
  public void updateScore( Question q ) {
    score = (questions.size() * score-q.getDefault()+q.getScore() ) / questions.size();
  }
  
  public double getScore() {
    return this.score;
  }
  
  public double getDefault() {
    return DEFAULT;
  }
}