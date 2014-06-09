package Praktikum10b.bin;

abstract class Bentuk{
	protected int a;
	protected int b;
	
	public String getBentuk(){
		return "BENTUK DARI SEGIEMPAT, LINGKARAN & SEGITIGA";
	}
	public abstract int HitungLuas();
}