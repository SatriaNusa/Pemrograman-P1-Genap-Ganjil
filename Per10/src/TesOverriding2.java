package Praktikum10b.bin;

class TesOverriding2{
	public static void cetakLuas(Bentuk btk){
		System.out.println();
		System.out.println(btk.getBentuk() + " dengan LUAS = " + btk.HitungLuas());
		
	}
	
	public static void main(String[] satria){
		Segi4 S4 = new Segi4(22,66);
		Segi3 S3 = new Segi3(28,68);
		Lingkaran Li = new Lingkaran(12);
		
		cetakLuas(S4);
		cetakLuas(S3);
		cetakLuas(Li);
	}
}