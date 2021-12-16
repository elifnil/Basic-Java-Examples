import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanýcý adý: ");
		String kullanýcý_adi = sc.nextLine();
		System.out.println("Parola: ");
		String parola = sc.nextLine();
		if(hesap.getKullanýcý_adi().equals(kullanýcý_adi) && hesap.getParola().equals(parola))
		{
			return true;
		}
		else
		{
			
			return false;
		}
		
				
		
	}

}
