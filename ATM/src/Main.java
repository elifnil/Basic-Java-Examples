import java.util.Scanner;

public class Main {

	    public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int bakiye=1000;
		String islemler =  "1.İşlem: Bakiye Öğrenme\n" +
		                   "2.İşlem: Para Yatırma\n" +
				           "3.İşlem: Para Çekme\n" +
		                   "4.İşlem: Çıkış Yapma";
		System.out.println("-----------------------");
		System.out.println(islemler);
		System.out.println("-----------------------");
		
		while(true)
		{
			System.out.println("Lütfen işlem türünüzü seçiniz: ");
			String islem =sc.nextLine();
			if(islem.equals("4"))
			{
				System.out.println("Çıkış yapılıyor..");
				break;
			}
			else if(islem.equals("1"))
			{
				System.out.println("Hesabınızda " +bakiye + " tutarında bakine bulunmaktadır." );
			}
			else if(islem.equals("2"))
			{
				System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				bakiye+=tutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
				
			}
			else if(islem.equals("3"))
			{
				System.out.println("Çekmek istediğiniz tutar: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				if(tutar>bakiye)
				{
					System.out.println("Hesabınızda yeterli bakine bulunmamaktadır.");
					System.out.println("Hesabınızda" + bakiye + " tutarında bakiye bulunmaktadır.");
					
				}
				else
				{
					bakiye-=tutar;
					System.out.println("Yeni bakiyeniz: " +bakiye);
				}
			}
			else
			{
					System.out.println("Geçerli bir işlem giriniz..");
					System.out.println(islemler);
			}
			
			
			
		}
		
		
	}

}
