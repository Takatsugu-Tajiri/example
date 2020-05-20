package model;

public class Gengou {
	int gengou;
	int nen;
	public Gengou(int gengou, int nen) {
		this.gengou = gengou;
		this.nen = nen;
	}
	public int getGengou() {
		return gengou;
	}
	public void setGengou(int gengou) {
		this.gengou = gengou;
	}
	public int getNen() {
		return nen;
	}
	public void setNen(int nen) {
		this.nen = nen;
	}

	public  String getName() {
		if(gengou==1) {
			return("昭和");
		}
		if(gengou==2) {
			return("平成");
		}
		else {
			return("令和");
		}
	}
		public int getSeireki() {
			if(gengou==1) {
				return nen+1925;
			}
			if(gengou==2) {
				return nen+1988;
			}
			else {
				return nen+2018;

			}
		}



}
