import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String sys_kullanici_adi="Elif Nil";
		String sys_parola="12345";
		int giris_hakki = 3;
		System.out.println("Kullanýcý Giriþ Sistemi");
		System.out.println("-------------------------------");
		while(true)
		{
			
			System.out.println("Kullanýcý adý: ");
			String kullanici_adi = sc.nextLine();
			System.out.println("Þifre: ");
			String parola = sc.nextLine();
			System.out.println("-------------------------------");
			if(kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola))
			{
				System.err.println("Sisteme giriþ yapýldý.");
				break;
			}
			else if(kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola))
			{
				System.out.println("Þifre yanlýþ.");
				giris_hakki-=1;
			}
			else if(!kullanici_adi.equals(kullanici_adi) && parola.equals(sys_parola))
			{
				System.out.println("Kullanýcý adý yanlýþ.");
				giris_hakki-=1;
			}
			else
			{
				System.out.println("Kullanýcý adý ve þifre yanlýþ.");
				giris_hakki-=1;
			}
			if(giris_hakki==0)
			{
				System.out.println("Giriþ hakkýnýz bitti.");
				break;
			}
		}
			
		
	}

}
