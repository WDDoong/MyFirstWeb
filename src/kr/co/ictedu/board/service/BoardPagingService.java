package kr.co.ictedu.board.service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardPageDTO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardPagingService implements IBoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession Session = request.getSession();
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
		
		// page파라미터에 있던 값을 가져옵니다.
		// page파라미터가 없다면 strPage에 null이 저장됨
		String strPage = request.getParameter("page");
		// null이 저장된 상황에는 int로 바꿔줄 수 없음
		// 파라미터가 없을때 들어갈 기본 페이지는 1페이지임.
		int page = 1;
		if(strPage != null) {
			page = Integer.parseInt(strPage);
		}
		// DAO생성
		BoardDAO dao = BoardDAO.getInstance();
		
		// 현재 보고 있는 페이지의 전체 글 가져오기
		// 페이지 번호를 그냥 넘기지 않고, 시작 번호를 계산해서 넘김.
		List<BoardVO> boardList = dao.getPageList((page - 1) * 10);
		// 얻어 온 글 전체 개수와 현재 조회중인 페이지 정보를 DTO에 넘겨줌 
		int count = dao.getBoardCount();
		
		// DTO의 역할은 페이지 하단에 링크만들 정보를 계산하는 것
		BoardPageDTO pageDTO = new BoardPageDTO(count, page, boardList);
		
		System.out.println("링크 버튼 정보 :: " + pageDTO);
		
		// 포워딩 하기 위해 적재하기
		request.setAttribute("boardList", boardList);
		request.setAttribute("pageDTO", pageDTO);
	}

}
