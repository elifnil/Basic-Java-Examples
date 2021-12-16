import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap)
	{
		Login login = new Login();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bankam�za Ho�geldiniz..");
		System.out.println("-----------------------");
		System.out.println("Kullan�c� Giri�i");
		System.out.println("-----------------------");
		int giris_hakki=3;
		while(true)
		{
			if(giris_hakki!=0) {
				if(login.login(hesap))
				{
					System.out.println("Giri� ba�ar�l�..");
					break;
				}
				else
					System.out.println("Giri� ba�ar�s�z..");
				    giris_hakki-=1;
				    System.out.println("Kalan giri� hakk�: " +giris_hakki);}
		    else
			{
			    System.out.println("Giri� hakk�n�z bitti..");
			    return;
			    
			}
		}
		
		
		System.out.println("-----------------------");
		String islemler="1.Bakiye G�r�nt�leme\n" + "2.Para Yat�rma\n" + "3.Para �ekme\n" + "��k�� yapmak i�in qya bas�n�z";
		System.out.println(islemler);
		System.out.println("--------------------------");
		
		while(true)
		{
			System.out.println("��lem t�r�n� se�iniz: ");
			String islem = sc.nextLine();
			if(islem.equals("q"))
			{
				System.out.println("��k�� yap�l�yor...");
				break;
			}
			else if(islem.equals("1"))
			{
				System.out.println("Bakiyeniz: " + hesap.getBakiye());
			}
			else if(islem.equals("2"))
			{
				System.out.println("Yat�r�lacak tutar� giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				hesap.paraYatirma(tutar);
			}
			else if(islem.equals("3"))
			{
				System.out.println("�ekmek istedi�iniz miktar� giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				hesap.paraCekme(tutar);
			}
			else
			{
				System.out.println("Ge�ersiz i�lem..");
			}
		}
		
	
		
		
	}

}
