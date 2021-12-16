import java.util.Scanner;

public class Yolcu implements IYurtdisiKurallari {
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	public Yolcu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yatýrdýðýnýz harç bedeli: ");
		this.harc = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Siyasi bir yasaðýnýz bulunuyor mu?(evet ya da hayýr þeklinde cevaplayýnýz) ");
		String cevap = sc.nextLine();
		if(cevap.equals("hayýr")) {
			this.siyasiYasak= false;
		}
		else {
			this.siyasiYasak=true;
		}
		System.out.println("Vizeniz bulunuyor mu?(evet ya da hayýr þeklinde cevaplayýnýz) ");
		String cevap2=sc.nextLine();
		if(cevap2.equals("evet")) {
			this.vizeDurumu=true;
		}
		else {
			this.vizeDurumu=false;
		}
	}
	@Override
	public boolean yurtdisiHarciKontrol() {
		if(this.harc<15) {
			System.out.println("Lütfen yurtdýþý çýkýþ harcýný tam yatýrýn..");
			return false;
		}
		else {
			System.out.println("Yurtdýþý harcý baþarýyla alýndý..");
			return true;
		}
	
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi yasaðýnýz dolayýsýyla yurtdýþýna çýkamazsýnýz..");
			return false;
		}
		else {
			System.out.println("Yurtdýþýna çýkmanýza mani bir siyasi yasaðýnýz bulunmamaktadýr..");
			return true;
		}
		
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize iþlemleri baþarýyla tamamlandý..");
			return true;
		}
		else {
			System.out.println("Vize iþlemleri tamamlanamadý..");
			return false;
		}
	}
	
	

}
