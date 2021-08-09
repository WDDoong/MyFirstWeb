package kr.co.ictedu.board.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글턴 패턴과 커넥션 풀을 적용해서
	// DAO의 연결부 (생성자, getInstance())까지 작성해주세요.
	private DataSource ds;
	
	// 싱글턴 패턴
	private BoardDAO() {
		
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 객체 생성
	private static BoardDAO dao = new BoardDAO();
	
	// 외부에서 객체 생성이 필요할 때 리턴
	public static BoardDAO getInstance() {
		return dao;
	}
}


