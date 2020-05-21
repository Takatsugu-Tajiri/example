package model;

public class Memo {
	private int mid;
	private String title;
	private String body;


	public Memo(int memo, String title, String body) {
		this.mid = memo;
		this.title = title;
		this.body = body;
	}


	public int getMemo() {
		return mid;
	}


	public void setMemo(int mid) {
		this.mid = mid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}



}
