package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;

// IBoardService 인터페이스 구현
public class BoardDeleteService implements IBoardService {
	
	// execute 메서드 오버라이딩
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession Session = null;
		Session = request.getSession();
		String idSession = (String)Session.getAttribute("idSession");
		
		if(idSession == null) {
			try {
				// 서비스 내부에서 포워딩을 시키면
				// 리다이렉트가 아니기때문에 실행됨.
				String ui = "/users/user_login_form.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		// bId파라미터 (디테일 페이지에서 post방식으로 날려준 것) 받기
		String bId = request.getParameter("bid");
		// DAO생성
		BoardDAO dao = BoardDAO.getInstance();
		// delete로직에 bId넣어서 실행
		dao.deleteBoard(bId);
	}

}
