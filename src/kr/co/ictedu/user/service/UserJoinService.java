package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserJoinService implements IUserService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try{
			request.setCharacterEncoding("UTF-8");
			// 폼에서 입력한 데이터 받기.
			String uId = request.getParameter("uid");
			String uPw = request.getParameter("upw");
			String uName = request.getParameter("uname");
			String uEmail = request.getParameter("email");
			// VO생성 및 데이터 입력
			UsersVO user = new UsersVO();
			user.setId(uId);
			user.setUpw(uPw);
			user.setUname(uName);
			user.setEmail(uEmail);
			
			UsersDAO dao = UsersDAO.getInstance();
			dao.joinUsers(user);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
	


