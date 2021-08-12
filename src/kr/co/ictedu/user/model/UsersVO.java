package kr.co.ictedu.user.model;

public class UsersVO {
	/*
	 * 	VO / DTO
	 * - VO클래스는 웹서버와 DB간의 데이터 송수신을 돕는 자바 클래스파일입니다.
	 * 
	 * - VO클래스를 설계할때는 DB테이블 컬럼 갯수만큼
	 * 	1:1로 자료형, 이름 등이 매칭되는 멤버 변수들을 선언합니다.
	 * 
	 * - VO클래스 내부 변수들은 private 접근 제한자를 걸어서
	 * 	데이터 접근을 제어 합니다.
	 */
	
	private String id; 
	private String upw; 
	private String uname; 
	private String email;  	

	// Alt + Shift + S 혹은 우클릭->source에 있는 메뉴 활용
	//VO클래스는 기본 생성자와 모든 멤버변수를 초기화하는 생성자를 선언
	public UsersVO() {
		//기본 생성자는 직접 작성
	}

	//Generate Constructor using fileds..
	public UsersVO(String id, String upw, String uname, String email) {
		super();
		this.id = id;
		this.upw = upw;
		this.uname = uname;
		this.email = email;
	}
	
	//Getter, Setter 선언
	//Generate Getter and Setter -> Select All
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//generate toString
	@Override
	public String toString() {
		return "UsersVO [id=" + id + ", upw=" + upw + ", uname=" + uname + ", email=" + email + "]";
	}
	

	
}
