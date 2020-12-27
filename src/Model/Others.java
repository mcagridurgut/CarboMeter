package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Others extends Category {

  private final double PHARMACEUTICALS = 1.8635; // kgCO2 per dollar
  private final double CLOTHES_TEXTILES_SHOES = 0.2892; // kgC2 usd dollar
  private final double BOOKS_MAGAZINES_ETC = 0.1971; // kgCO2 usd dollar
  private final double COMPUTER_IT = 0.8231; // kgCO2 usd dollar
  private final double TV_RADIO_PHONE = 0.8231; // kgCO2 usd dollar
  private final double MOTOR_VEHICLES = 0.2137; // kgCO2 usd dollar
  private final double FURNITURE_OTHER = 0.2224; // kgCO2 usd dollar
  private final double HOTELS_RESTAURANTS_PUBS = 0.2671; // kgCO2 usd dollar
  private final double CALL_COST = 0.1740; // kgCO2 usd dollar
  private final double BANKING_FINANCE = 0.2816; // kgCO2 usd dollar
  private final double ACTIVITIES = 0.2289; // kgCO2 usd dollar
  private final double INSURANCE = 0.1264; // kgCO2 usd dollar
  private final double EDUCATION = 0.1791; // kgCO2 usd dollar

  private final double DEFAULT = 14000;

  public Others(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}