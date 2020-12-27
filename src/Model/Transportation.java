package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Transportation extends Category {

  // MOTORBIKE CONSTANTS
  public static final double UP_TO_125CC = 63.81567;
  public static final double OVER_125CC_UP_TO_500CC = 77.76306;
  public static final double OVER_500CC = 102.0573;
  public static final double MOTORBIKE_MANUEL_EFFICIENCY_FACTOR = 0.02168;

  //PUBLIC_TRANSPORTATION CONSTANTS
  public static final double BUS_FACTOR = 0.1091; // kgCO2 per kilometer
  public static final double COACH_FACTOR = 0.0273; // kgCO2 per kilometer
  public static final double LOCAL_COMMUTTER_TRAIN_FACTOR = 0.0369; // kgCO2 per kilometer
  public static final double LONG_DISTANCE_TRAIN_FACTOR = 0.005; // kgCO2 per kilometer
  public static final double TRAM_FACTOR = 0.0299; // kgCO2 per kilometer
  public static final double TAXI_FACTOR = 1.455; // kgCO2 per kilometer
  public static final double SUBWAY_FACTOR = 0.0275; // kgCO2 per kilometer

  // CAR CONSTANTS
  public static final double CAR_PETROL_FACTOR = 0.02168;
  public static final double CAR_DIESEL_FACTOR = 0.02546;
  public static final double CAR_LPG_FACTOR = 0.01555;
  public static final double CAR_CNG_FACTOR = 0.00443;

  // PLANE CONSTANTS
  public static final double FLIGHT_CO2_FACTOR = 0.643736;

  //Constant average
  public static final double DEFAULT = 15391.0;

  public Transportation(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}