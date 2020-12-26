package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Transportation extends Category {

  private final double DEFAULT = 12.4;

  public Transportation(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}