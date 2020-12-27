package mail;

/**
 * JavaMail class for sending email
 * @author Alper Mumcular
 * @version 27.12.2020
 */
public class JavaMail {
	/**
	 * Sends the email
	 * @param email --> email of the user
	 * @param subject --> subject of the email
	 * @param mail --> details of the mail
	 */
	public static void sendMail(String email, String subject, String mail) {
		try {
			JavaMailUtil.sendMail(email, subject, mail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
