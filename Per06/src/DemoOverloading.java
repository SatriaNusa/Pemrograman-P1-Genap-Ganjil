package Pertemuan06b.bin;

public class DemoOverloading {
	public static void main(String[] args){
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "Satria";
		d.email = "sunyi_strip@rocketmail.com";
		d.info();
	}
		
}