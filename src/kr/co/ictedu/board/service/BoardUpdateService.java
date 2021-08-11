package kr.co.ictedu.board.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardUpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 오버라이딩된 내부, 파라미터 6개 받아오기
		String strbId = request.getParameter("bid");
		int bId = Integer.parseInt(strbId);
		String bName = request.getParameter("bname");
		String bTitle = request.getParameter("btitle");
		String bContent = request.getParameter("bcontent");
		String strdate = request.getParameter("bdate");
		Timestamp bDate = Timestamp.valueOf(strdate);
		String bhit = request.getParameter("bhit");
		int bHit = Integer.parseInt(bhit);
		
		// VO생성해서 setter로 저장하기
		BoardVO board = new BoardVO();
		board.setbId(bId);
		board.setbContent(bContent);
		board.setbName(bName);
		board.setbTitle(bTitle);
		board.setbDate(bDate);
		board.setbHit(bHit);
		// DAO 생성 및 update로직 호출
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateBoard(board);
		
	}

}
