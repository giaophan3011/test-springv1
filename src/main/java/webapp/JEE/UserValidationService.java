package webapp.JEE;

public class UserValidationService {
	public boolean isValid(String user, String password){
		if (user.equals("giao")&&password.equals("123456")){
			return true;
		}
		if (user.equals("timi")&&password.equals("123456")){
			return true;
		}
		
		return false;
	}
}
