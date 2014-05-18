package Pertemuan08.bin;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaksi{
	private BigDecimal total;
	private String kasir;
	private Date waktu;
	
	private List<TransaksiDetail> daftarBelanja = new ArrayList<TransaksiDetail>();
	private List<Diskon> daftarDiskon = new ArrayList<Diskon>();
	private Pembayaran pembayaran;
	
	public BigDecimal hitungTotal(){
		for(TransaksiDetail td : daftarBelanja){
			total = total.add(td.subtotal());
		}
		return total;
	}
	
	public BigDecimal hitungTagihan(){
		BigDecimal totalDiskon = BigDecimal.ZERO;
		for(Diskon d:daftarDiskon){
			totalDiskon = totalDiskon.add(d.hitung(this));
		}
		return hitungTotal().subtract(totalDiskon);
	}
	
}