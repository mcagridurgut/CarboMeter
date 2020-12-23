package mail;

public class JavaMail {
	public static void sendMail(String email, String userPassword) {
		try {
			JavaMailUtil.sendMail(email, userPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
