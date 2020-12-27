package Model;

/**
 * Categories class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public abstract class Category {
  //data members
  private Double def = 0.0;
  private boolean isPersonalized;
  //private ArrayList<Question> questions;
  private double score;

  /**
   * constructor
   * @param isPersonalized --> boolean result of whether it is personalized or not
   */
  public Category(boolean isPersonalized) {
    //questions = new ArrayList<Question>();
    score = def;
    this.isPersonalized = isPersonalized;
  }

  /**
   * Sets the default
   * @param def --> default
   */
  public void setDef( double def){
    this.def = def;
  }

  /**
   * Updates the score
   * @param score --> score
   */
  public void updateScore(double score) {
    if(isPersonalized)
      this.score = score;
    //score = (questions.size() * score-q.getDefault()+q.getScore() ) / questions.size();
  }

  /**
   * Gets the score
   * @return score
   */
  public double getScore() {
    return this.score;
  }
}
