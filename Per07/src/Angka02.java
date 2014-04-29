package Pertemuan07a.bin;

public class Angka02 {
	public static void main(String[] satria){
		int Penyebut = 9;
		int Pembilang = 2;
		try{
			System.out.println("Hasil Pembagiannya adalah " + Penyebut/Pembilang);
		}
		catch(ArithmeticException e){
			System.out.println("Pembagian dengan angka 0...");
		}
		System.out.println("Selesai");
	}
}