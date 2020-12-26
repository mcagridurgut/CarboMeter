package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Transportation extends Category {

  // MOTORBIKE CONSTANTS
  private final double UP_TO_125CC = 63.81567;
  private final double OVER_125CC_UP_TO_500CC = 77.76306;
  private final double OVER_500CC = 102.0573;
  private final double MANUEL_EFFICIENCY_FACTOR = 0.217;

  //PUBLIC_TRANSPORTATION CONSTANTS
  private final double BUS_FACTOR = 0.1091; // kgCO2 per kilometer
  private final double COACH_FACTOR = 0.0273; // kgCO2 per kilometer
  private final double LOCAL_COMMUTTER_TRAIN_FACTOR = 0.0369; // kgCO2 per kilometer
  private final double LONG_DISTANCE_TRAIN_FACTOR = 0.005; // kgCO2 per kilometer
  private final double TRAM_FACTOR = 0.0299; // kgCO2 per kilometer
  private final double TAXI_FACTOR = 1.455; // kgCO2 per kilometer
  private final double SUBWAY_FACTOR = 0.0275; // kgCO2 per kilometer

  //Constant average
  private final double DEFAULT = 12.4;

  public Transportation(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}