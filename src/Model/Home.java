package Model;

/**
 * Home class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */ 
public class Home extends Category {

  private final double DEFAULT = 24.3;

  public Home(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}