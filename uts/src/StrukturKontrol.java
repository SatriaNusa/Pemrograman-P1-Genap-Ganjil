public class StrukturKontrol{
	public static void main(String[] satria){
		double nilai_akhir;
		double uas = 60.0;
		double uts = 45.0;
		double tugas = 37.0;
		double absen = 50.0;
		nilai_akhir = (uas*40/100) + (uts*30/100) + (tugas*20/100) + (absen*10/100);
		if(nilai_akhir < 60){
			System.out.println("Tidak Lulus");
		}
	}
	
}