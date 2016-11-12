package control;
import valueObject.UserInfo;

/**
 * @author admin
 * @version 1.0
 * @created 17-3-2016 오후 3:09:28
 */
public class AuthenticationManager {

	public AuthenticationManager(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param userInfo
	 */
	public boolean authenticate(UserInfo userInfo){
		System.out.println(" ");
		System.out.println("===로그인 되었습니다===");
		System.out.println(" ");
		return true;
	}
}//end AutheticationManager