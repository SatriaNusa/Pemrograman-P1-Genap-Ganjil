package Praktikum10d.bin;

class TesOverriding4{
	public static void main(String[] satria){
		KomunitasPT2 DtJRS = new KomunitasPT2("Teknik Informatika","Jakarta Selatan","LK");
		Karyawan2 KA = new Karyawan2("Satria Nusa S.T", "Depok","Wanita",318,2000000);
		System.out.println();
		DtJRS.Tampilkan3();
		System.out.println();
		KA.Tampilkan3();
	}
}