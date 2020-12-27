package Model;

/**
 * Home class 
 * @author Alper Mumcular
 * @version 17.12. 2020
 */ 
public class Home extends Category {

  private final double MONTHS_IN_A_YEAR = 12;
  private final double ELECTRICITY_FACTOR = 0.480; // kgCO2 per kwh
  private final double NATURAL_GAS_FACTOR = 1.8902; // kgCO2 per cubic meters
  private final double HEATING_OIL_FACTOR = 2.5404; // kgCO2 per litre
  private final double COAL_FACTOR = 2883.26; // kgCO2 per tonnes
  private final double LPG_FACTOR = 1.665; // kgCO2 per litre
  private final double PROPANE_FACTOR = 1.665; // kgCO2 per litre
  private final double WOODEN_PELLETS = 1008; // kgCO2 per tonnes

  private final double DEFAULT = 12000;

  public Home(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}