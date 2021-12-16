import java.util.Scanner;

public class Main {

	    public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int bakiye=1000;
		String islemler =  "1.��lem: Bakiye ��renme\n" +
		                   "2.��lem: Para Yat�rma\n" +
				           "3.��lem: Para �ekme\n" +
		                   "4.��lem: ��k�� Yapma";
		System.out.println("-----------------------");
		System.out.println(islemler);
		System.out.println("-----------------------");
		
		while(true)
		{
			System.out.println("L�tfen i�lem t�r�n�z� se�iniz: ");
			String islem =sc.nextLine();
			if(islem.equals("4"))
			{
				System.out.println("��k�� yap�l�yor..");
				break;
			}
			else if(islem.equals("1"))
			{
				System.out.println("Hesab�n�zda " +bakiye + " tutar�nda bakine bulunmaktad�r." );
			}
			else if(islem.equals("2"))
			{
				System.out.println("Yat�rmak istedi�iniz tutar� giriniz: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				bakiye+=tutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
				
			}
			else if(islem.equals("3"))
			{
				System.out.println("�ekmek istedi�iniz tutar: ");
				int tutar = sc.nextInt();
				sc.nextLine();
				if(tutar>bakiye)
				{
					System.out.println("Hesab�n�zda yeterli bakine bulunmamaktad�r.");
					System.out.println("Hesab�n�zda" + bakiye + " tutar�nda bakiye bulunmaktad�r.");
					
				}
				else
				{
					bakiye-=tutar;
					System.out.println("Yeni bakiyeniz: " +bakiye);
				}
			}
			else
			{
					System.out.println("Ge�erli bir i�lem giriniz..");
					System.out.println(islemler);
			}
			
			
			
		}
		
		
	}

}
