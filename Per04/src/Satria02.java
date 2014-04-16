// Praktikum Soal 2
package Latihan01.sesi1.bin;

public class Satria02{
	private String nama;
	public static void main(String[] satria){
		Satria02 test;
		test = new Satria02();
		test.setNama("Satria Nusa"); 
		byte b = 100;
		short s = 100;
		
		Satria02 belajarVariabel = test;
		belajarVariabel.setNama("Belajar Variabel");
		
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