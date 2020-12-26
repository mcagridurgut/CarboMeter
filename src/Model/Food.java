package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Food extends Category {

  private final double DEFAULT = 54.3;

  public Food(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}