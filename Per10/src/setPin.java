package Praktikum10e.bin;

public class Tabung{
	private String Nama;
	private int NoRek;
	private int Saldo;
	private int Pin;
	
	public Tabung(String NAMA, int NOREK){
		Nama = NAMA;
		NoRek = NOREK;
		Pin = 666666;
	}
	
	public void Simpan(int Sal){
		Saldo = Saldo + Sal;
	}
	
	public void Tarik(int jmlTarik){
		Saldo = Saldo - jmlTarik;
	}
	
	public int getSaldo(){
		return Saldo;
	}
	
	public void setSaldo(int Sal){
		Saldo = Sal;
	}
}