package model;

import java.sql.Date;

public class Uriage {
	private int uid;
	private int sid;
	private int kosu;
	private Date hi;
	public Uriage(int uid, int sid, int kosu, Date hi) {
		this.uid = uid;
		this.sid = sid;
		this.kosu = kosu;
		this.hi = hi;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getKosu() {
		return kosu;
	}
	public void setKosu(int kosu) {
		this.kosu = kosu;
	}
	public Date getHi() {
		return hi;
	}
	public void setHi(Date hi) {
		this.hi = hi;
	}






}
