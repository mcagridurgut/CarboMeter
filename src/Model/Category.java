package Model;

/**
 * Categories class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public abstract class Category {

  private Double def = 0.0;
  private boolean isPersonalized;
  //data members
  //private ArrayList<Question> questions;
  private double score;

  public Category(boolean isPersonalized) {
    //questions = new ArrayList<Question>();
    score = def;
    this.isPersonalized = isPersonalized;
  }

  public void setDef( double def){
    this.def = def;
  }

  public void updateScore(double score) {
    if(isPersonalized)
      this.score = score;
    //score = (questions.size() * score-q.getDefault()+q.getScore() ) / questions.size();
  }

  public double getScore() {
    return this.score;
  }
}
