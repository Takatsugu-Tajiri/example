package model;

public class Keisan {
	private int num1;
	private int num2;
	private int mode;
	public Keisan(int num1, int num2, int mode) {
		this.num1 = num1;
		this.num2 = num2;
		this.mode = mode;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}


	public int getKotae() {
		int kotae;
		if(mode==0){
			return kotae=num1+num2;
		}
		else {
			return kotae=num1-num2;
		}
	}

}
