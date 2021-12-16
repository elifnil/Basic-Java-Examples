import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Program�na Ho�geldiniz..");
		Scanner scanner = new Scanner(System.in);
		String islemler = "��lemler..\n"
				           + "1.Kanallar� G�ster\n"
				           + "2.Kanal Ekle \n"
				           + "3.Kanal Sil \n"
				           + "4.Kanal Say�s� ��ren \n"
				           + "��k�� i�in q'ya bas�n�z.";
		Kumanda kumanda = new Kumanda();
		while(true) {
			System.out.println(islemler);
			System.out.print("��lemi giriniz: ");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor..");
				break;
			}
			else if(islem.equals("1")) {
				kanallar�Goster(kumanda);
				
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
            	System.out.println("Kanal say�s�: " +kumanda.kanalSayisi());
				
			}
            else {
            	System.out.println("L�tfen ge�erli bir i�lem giriniz..");
            }
		}
		
		

	}
	public static void kanallar�Goster(Kumanda kumanda) {
		if(kumanda.kanalSayisi() ==0) {
			System.out.println("�u anda hi�bir kanal bulunmuyor..");
			
		}
		else {
			for(String kanal: kumanda) {
				System.out.println("Kanal: " +kanal);
			}
		}
	}

}
