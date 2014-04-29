package Pertemuan05j.bin;
import java.util.Random;

public class DemoJump2 {
	public static void main(String[] Satria){
		Integer faktor = 7;
		Integer jumlahFaktorDiinginkan = 4;
		Integer batasAtas = 2000000000;
		System.out.println("Mencari Kelipatan " + faktor + " dengan break dan Continue");
		Integer jumlahFaktorDitemukan = 0;
		while(true){
			Integer random = new Random().nextInt();
			System.out.println("Bilangan Random : " + random);
			if(random > batasAtas){
				System.out.println("Melewati batas atas, langsung selesai");
				return;
			}
			
			if(random % faktor == 0){
				System.out.println("Kelipatan " + faktor + " ditemukan, yaitu : " + random);
				jumlahFaktorDitemukan++;
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan){
					System.out.println("Baru menemukan " + jumlahFaktorDitemukan + " faktor");
					System.out.println("dari " + jumlahFaktorDiinginkan + " yang diminta, lanjut lagi");
					continue;
				} else {
					System.out.println("Sudah menemukan " + jumlahFaktorDiinginkan + " Faktor Selesai Looping");
					break;
				}
			}
		}
		System.out.println("Selesai mencari kelipatan");
	}
}