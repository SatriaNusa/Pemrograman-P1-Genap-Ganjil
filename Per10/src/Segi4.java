package Praktikum10b.bin;

class Segi4 extends Bentuk{
	public Segi4(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String getBentuk(){
		return "Bentuk Persegi Empat";
	}
	
	public int HitungLuas(){
		return a*b;
	}
}