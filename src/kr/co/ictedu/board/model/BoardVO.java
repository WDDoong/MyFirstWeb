package kr.co.ictedu.board.model;

import java.sql.Timestamp;

public class BoardVO {
	private int bid;
	private String bname;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int bhit;
	
	public BoardVO() {
		
	}

	public BoardVO(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bhit) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return btitle;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}

	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", bname=" + bname + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bdate=" + bdate + ", bhit="
				+ bhit + "]";
	}

	
	
	
}
