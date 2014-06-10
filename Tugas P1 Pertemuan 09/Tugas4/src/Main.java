package model;

public class Main{
	public static void main(String[] satria){
		Santapan s = new Santapan();
		Makanan ma = new Makanan();
		Minuman mi = new Minuman();
		Cemilan ce = new Cemilan();
		
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}