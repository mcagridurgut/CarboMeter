package deneme;

public class JavaMail {
	public static void main(String[] args) {
		try {
			JavaMailUtil.sendMail("alper.mumcular@ug.bilkent.edu.tr");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
