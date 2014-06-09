package Praktikum10d.bin;

class KomunitasPT2{
	protected String Nama;
	protected String Alamat;
	protected String JK;
	
	KomunitasPT2(String NAMA, String ALAMAT, String JK){
		Nama = NAMA;
		Alamat = ALAMAT;
		JK = JK;
	}
	
	public void Tampilkan3(){
		System.out.println("Nama          = " + Nama);
		System.out.println("Alamat        = " + Alamat);
		System.out.println("Jenis Kelamin = " + JK);
	}
}