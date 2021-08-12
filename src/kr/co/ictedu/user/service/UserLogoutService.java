package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogoutService implements IUserService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession Session = null;
		Session = request.getSession();
		
		Session.invalidate();
	}
	

}
