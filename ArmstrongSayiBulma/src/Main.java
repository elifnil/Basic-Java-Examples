import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int sayi = sc.nextInt();
		System.out.println("Basamak sayisini giriniz: ");
		int basamak_sayisi = sc.nextInt();
		int gecici_sayi=sayi;
		int toplam =0;
		
		do
		{
			
			int basamak_degeri=gecici_sayi%10;
			gecici_sayi/=10;
			toplam += Math.pow(basamak_degeri,basamak_sayisi );
		}while(gecici_sayi>0);
		System.out.println("Toplam: " +toplam);
		
		if(toplam==sayi)
		{
			System.out.println("Sayi armstrong numberdir.");
			
		}
		else
		{
			System.out.println("Armstrong deðil.");
		}
		
		
		

	}

}
