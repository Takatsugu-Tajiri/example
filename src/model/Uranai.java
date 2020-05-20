package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Uranai {
	public String getLuck() {
		String[] luckArray= {"超スッキリ","スッキリ","最悪"};
		int index =(int)(Math.random()*3);
		String luck=luckArray[index];
		return luck;
	}
	public String getToday() {
		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);
		return today;

	}


}
