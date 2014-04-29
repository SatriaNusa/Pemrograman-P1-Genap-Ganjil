package Pertemuan06d.bin;

public class Perpustakaan {
	private String id;
	private String namaPeminjam;
	private String judulBuku;
	
	public String getJudulBuku(){
		return judulBuku;
	}
	
	public void setJudulBuku(String judulBuku){
		this.judulBuku = judulBuku;
	}
	
	public String getNamaPeminjam(){
		return namaPeminjam;
	}
	
	public void setNamaPeminjam(String namaPeminjam){
		this.namaPeminjam = namaPeminjam;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
}