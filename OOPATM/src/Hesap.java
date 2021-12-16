
public class Hesap {
	private String kullanýcý_adi;
	private String parola;
	private int bakiye;
	public Hesap(String kullanýcý_adi, String parola, int bakiye) {
		super();
		this.kullanýcý_adi = kullanýcý_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullanýcý_adi() {
		return kullanýcý_adi;
	}
	public void setKullanýcý_adi(String kullanýcý_adi) {
		this.kullanýcý_adi = kullanýcý_adi;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYatirma (int tutar) {
		bakiye+=tutar;
		System.out.println("Yeni bakiyeniz: " +bakiye);
	}
	public void paraCekme(int tutar)
	{
		if(bakiye<tutar)
		{
			System.out.println("Yeterli bakiyeniz bulunmamaktadýr.");
		}
		else
		{
			bakiye-=tutar;
			System.out.println("Yeni bakiyeniz: " +bakiye);
		}
	}
	

}
