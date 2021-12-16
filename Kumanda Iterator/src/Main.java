import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Programýna Hoþgeldiniz..");
		Scanner scanner = new Scanner(System.in);
		String islemler = "Ýþlemler..\n"
				           + "1.Kanallarý Göster\n"
				           + "2.Kanal Ekle \n"
				           + "3.Kanal Sil \n"
				           + "4.Kanal Sayýsý Öðren \n"
				           + "Çýkýþ için q'ya basýnýz.";
		Kumanda kumanda = new Kumanda();
		while(true) {
			System.out.println(islemler);
			System.out.print("Ýþlemi giriniz: ");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor..");
				break;
			}
			else if(islem.equals("1")) {
				kanallarýGoster(kumanda);
				
			}
            else if(islem.equals("2")) {
            	System.out.print("Eklenecek kanal: ");
            	String kanal_ismi = scanner.nextLine();
            	kumanda.kanalEkle(kanal_ismi);
				
			}
            else if(islem.equals("3")) {
            	System.out.print("Silinecek kanal: ");
            	String kanal_ismi = scanner.nextLine();
            	kumanda.kanalSil(kanal_ismi);
				
			}
            else if(islem.equals("4")) {
            	System.out.println("Kanal sayýsý: " +kumanda.kanalSayisi());
				
			}
            else {
            	System.out.println("Lütfen geçerli bir iþlem giriniz..");
            }
		}
		
		

	}
	public static void kanallarýGoster(Kumanda kumanda) {
		if(kumanda.kanalSayisi() ==0) {
			System.out.println("Þu anda hiçbir kanal bulunmuyor..");
			
		}
		else {
			for(String kanal: kumanda) {
				System.out.println("Kanal: " +kanal);
			}
		}
	}

}
