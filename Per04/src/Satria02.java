package Praktikum02.bin;

public class Satria02{
	private String nama;
	public static void main(String[] satria){
		Satria02 test;
		test = new Satria02();
		test.setNama("Fajar");
		byte b = 100;
		short s = 100;
		
		Satria02 belajarVariabel = test;
		belajarVariabel.setNama("Belajar variabel");
		
		System.out.println(b + s);
		System.out.println("Nama : " + test.getNama() + " " + b);
	}
	
	public void setNama(String aNama){
		this.nama = aNama;
	}
	
	public String getNama(){
		return this.nama;
	}
}