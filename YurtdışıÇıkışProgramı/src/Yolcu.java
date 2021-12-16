import java.util.Scanner;

public class Yolcu implements IYurtdisiKurallari {
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	public Yolcu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yat�rd���n�z har� bedeli: ");
		this.harc = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Siyasi bir yasa��n�z bulunuyor mu?(evet ya da hay�r �eklinde cevaplay�n�z) ");
		String cevap = sc.nextLine();
		if(cevap.equals("hay�r")) {
			this.siyasiYasak= false;
		}
		else {
			this.siyasiYasak=true;
		}
		System.out.println("Vizeniz bulunuyor mu?(evet ya da hay�r �eklinde cevaplay�n�z) ");
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
			System.out.println("L�tfen yurtd��� ��k�� harc�n� tam yat�r�n..");
			return false;
		}
		else {
			System.out.println("Yurtd��� harc� ba�ar�yla al�nd�..");
			return true;
		}
	
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi yasa��n�z dolay�s�yla yurtd���na ��kamazs�n�z..");
			return false;
		}
		else {
			System.out.println("Yurtd���na ��kman�za mani bir siyasi yasa��n�z bulunmamaktad�r..");
			return true;
		}
		
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize i�lemleri ba�ar�yla tamamland�..");
			return true;
		}
		else {
			System.out.println("Vize i�lemleri tamamlanamad�..");
			return false;
		}
	}
	
	

}
