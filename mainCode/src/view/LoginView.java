package view;
import java.io.IOException;
import java.util.Scanner;

import control.AuthenticationManager;
import valueObject.UserInfo;

/**
 * @author admin
 * @version 1.0
 * @created 17-3-2016 오후 3:09:33
 */
public class LoginView {
	private AuthenticationManager authenticationManager;

	public LoginView(){
		this.authenticationManager = new AuthenticationManager();
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param id
	 * @param password
	 * @throws IOException 
	 */
	public boolean login() throws IOException{
		System.out.println("======login======");
		//int input = System.in.read();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		String id = scanner.nextLine();
		System.out.print("패스워드를 입력하세요: ");
		String password = scanner.nextLine();
		
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setPassword(password);
		
		boolean result = this.authenticationManager.authenticate(userInfo);
		
		return result;
	}
}//end Login