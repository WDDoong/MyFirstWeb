package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserLoginService implements IUserService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			// 폼에서 날린 데이터 받기
			String uId = request.getParameter("uid");
			String uPw = request.getParameter("upw");
			
			// 세션 쓰는법
			HttpSession Session = null;
			Session = request.getSession();
			
			// VO생성 및 데이터 입력
			UsersVO user = new UsersVO();
			user.setId(uId);
			user.setUpw(uPw);
			
			
			// 데이터 받아서 dao호출
			UsersDAO dao = UsersDAO.getInstance();
			int resultCode = dao.userLogin(user);
			
			
			if(resultCode == 1) {
				// 통과시 세션발급을 해주세요.
				Session.setAttribute("idSession", uId);
				Session.setAttribute("pwSession", uPw);
				System.out.println("success");
			}else if(resultCode == 0) {
				Session.setAttribute("login", "fail");
				System.out.println("fail");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	

}
