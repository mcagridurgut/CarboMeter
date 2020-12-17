package others;

import question.*;
import user.*;

public class Challenge {
  
  private static final int DONE = 1;
  private static final int UNDONE = 0;
  
  private SuperUser superUser;
  private String challengeTitle;
  private String details;
  private int status;
  
  public Challenge(String title, String details, SuperUser superUser ) {
    this.challengeTitle = title;
    this.details = details;
    this.superUser = superUser;
    this.status = UNDONE;
  }
  
  public String getTitle() {
    return challengeTitle;
  }
  
  public String getDetails() {
    return this.details;
  }
  
  public SuperUser getSuperUser() {
    return this.superUser;
  }
  
  public void challengeCompleted() {
    this.status = DONE;
  }
  
}