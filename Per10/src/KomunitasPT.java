package Praktikum10c.bin;

class KomunitasPT{
	protected String Nama;
	protected String Alamat;
	protected String JK;
	
	KomunitasPT(String NAMA, String ALAMAT, String JK){
		Nama = NAMA;
		Alamat = ALAMAT;
		JK = JK;
	}
	
	public void Tampilkan1(){
		System.out.println("Nama          = " + Nama);
		System.out.println("Alamat        = " + Alamat);
		System.out.println("Jenis Kelamin = " + JK);
	}
}