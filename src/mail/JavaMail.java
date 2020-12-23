package mail;

public class JavaMail {
	public static void main(String[] args) {
		try {
			JavaMailUtil.sendMail("mcagridurgut@gmail.com", "mumcular123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
