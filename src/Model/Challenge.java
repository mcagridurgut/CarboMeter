package Model;

import user.*;

/**
 * Challenge class
 * @author Alper Mumcular
 * @version 27.12.2020
 */
public class Challenge {

  // CONSTANTS
  private static final int DONE = 1;
  private static final int UNDONE = 0;

  // instance data members
  private SuperUser superUser;
  private String challengeTitle;
  private String details;
  private int status;

  /**
   * constructor
   * @param title --> title of the challenge
   * @param details --> details of the challenge
   * @param superUser --> creator super-user of the challenge
   */
  public Challenge(String title, String details, SuperUser superUser ) {
    this.challengeTitle = title;
    this.details = details;
    this.superUser = superUser;
    this.status = UNDONE;
  }

  /**
   * Gets the title of the challenge
   * @return challenge title
   */
  public String getTitle() {
    return challengeTitle;
  }

  /**
   * Gets the details of the challenge
   * @return challenge details
   */
  public String getDetails() {
    return this.details;
  }

  /**
   * Gets the super-user
   * @return super user
   */
  public SuperUser getSuperUser() {
    return this.superUser;
  }

  /**
   * Sets the challenge status as completed
   */
  public void challengeCompleted() {
    this.status = DONE;
  }
  
}