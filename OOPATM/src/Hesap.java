
public class Hesap {
	private String kullan�c�_adi;
	private String parola;
	private int bakiye;
	public Hesap(String kullan�c�_adi, String parola, int bakiye) {
		super();
		this.kullan�c�_adi = kullan�c�_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullan�c�_adi() {
		return kullan�c�_adi;
	}
	public void setKullan�c�_adi(String kullan�c�_adi) {
		this.kullan�c�_adi = kullan�c�_adi;
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
			System.out.println("Yeterli bakiyeniz bulunmamaktad�r.");
		}
		else
		{
			bakiye-=tutar;
			System.out.println("Yeni bakiyeniz: " +bakiye);
		}
	}
	

}
