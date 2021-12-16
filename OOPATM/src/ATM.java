import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap)
	{
		Login login = new Login();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bankamýza Hoþgeldiniz..");
		System.out.println("-----------------------");
		System.out.println("Kullanýcý Giriþi");
		System.out.println("-----------------------");
		int giris_hakki=3;
		while(true)
		{
			if(giris_hakki!=0) {
				if(login.login(hesap))
				{
					System.out.println("Giriþ baþarýlý..");
					break;
				}
				else
					System.out.println("Giriþ baþarýsýz..");
				    giris_hakki-=1;
				    System.out.println("Kalan giriþ hakký: " +giris_hakki);}
		    else
			{
			    System.out.println("Giriþ hakkýnýz bitti..");
			    return;
			    
			}
		}
		
		
		System.out.println("-----------------------");
		String islemler="1.Bakiye Görüntüleme\n" + "2.Para Yatýrma\n" + "3.Para Çekme\n" + "Çýkýþ yapmak için qya basýnýz";
		System.out.println(islemler);
		System.out.println("--------------------------");
		
		while(true)
		{
			System.out.println("Ýþlem türünü seçiniz: ");
			String islem = sc.nextLine();
			if(islem.equals("q"))
			{
				System.out.println("Çýkýþ yapýlýyor...");
				break;
			}
			else if(islem.equals("1"))
			{
				System.out.println("Bakiyeniz: " + hesap.getBakiye());
			}
			else if(islem.equals("2"))
			{
				System.out.println("Yatýrýlacak tutarý giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				hesap.paraYatirma(tutar);
			}
			else if(islem.equals("3"))
			{
				System.out.println("Çekmek istediðiniz miktarý giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				hesap.paraCekme(tutar);
			}
			else
			{
				System.out.println("Geçersiz iþlem..");
			}
		}
		
	
		
		
	}

}
