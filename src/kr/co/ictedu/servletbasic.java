package kr.co.ictedu;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletbasic
 */
//WebServlet("/주소") 의 주소로 접속시 서블릿이 작동함
@WebServlet("/apple")
// HttpServlet을 상속받은 클래스 내부에서는 Session, request, response등의
// 객체를 자바 코드 내에서 사용할 수 있음.
public class servletbasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletbasic() {
        super();
        System.out.println("서블릿 객체 생성 완료!");
    }// 서블릿 객체 생성. 최초 생성 후 재사용. 

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    // HttpServlet 객체를 상속받은 클래스 내부라고 해서
    // 무턱대고 만든 모든 메서드가 주소 접속시마다 호출되지는 않습니다.
    // 아래와 같이 상속받은 메서드를 오버라이딩 하는 경우만
    // 호출이 되는 점에 유의해주세요. (생성자이거나, 상속을 받았거나)
	public void init(ServletConfig config) throws ServletException {
		// 요청이 들어왔을때 처음에 실행할 로직을 작성하는 부분
		// init()메서드는 서블릿 객체 생성시 한번 자동으로 호출됩니다.
		System.out.println("init메서드 호출!"); 
	}// web연결 절차

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// 소멸자 메서드, 서블릿 객체가 메모리에서 삭제될 때 호출(소멸시 1회만)
		System.out.println("destroy메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Http Get 요청이 들어왔을때만 작동하는 메서드
		System.out.println("doGet 메서드 호출됨!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  Http Post 요청이 들어왔을때만 작동하는 메서드
		// .jsp파일에 폼을 만들고, post요청을 하도록 처리합니다.
		System.out.println("doPost 메서드 호출됨!!!");
	}

}