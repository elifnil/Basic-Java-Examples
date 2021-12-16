
public class Hesap {
	private String kullanıcı_adi;
	private String parola;
	private int bakiye;
	public Hesap(String kullanıcı_adi, String parola, int bakiye) {
		super();
		this.kullanıcı_adi = kullanıcı_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullanıcı_adi() {
		return kullanıcı_adi;
	}
	public void setKullanıcı_adi(String kullanıcı_adi) {
		this.kullanıcı_adi = kullanıcı_adi;
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
			System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
		}
		else
		{
			bakiye-=tutar;
			System.out.println("Yeni bakiyeniz: " +bakiye);
		}
	}
	

}
