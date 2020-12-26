package mail;

public class JavaMail {
	public static void sendMail(String email, String subject, String mail) {
		try {
			JavaMailUtil.sendMail(email, subject, mail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
