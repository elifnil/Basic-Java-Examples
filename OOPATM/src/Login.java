import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullan�c� ad�: ");
		String kullan�c�_adi = sc.nextLine();
		System.out.println("Parola: ");
		String parola = sc.nextLine();
		if(hesap.getKullan�c�_adi().equals(kullan�c�_adi) && hesap.getParola().equals(parola))
		{
			return true;
		}
		else
		{
			
			return false;
		}
		
				
		
	}

}
