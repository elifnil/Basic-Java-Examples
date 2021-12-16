import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bankamýza hoþgeldiniz. Güncel fazi oraný %6");
		System.out.println("Yatýrmak istediðiniz tutarý giriniz: ");
		double tutar = sc.nextDouble();
		System.out.println("Kaç yýl vadeli yatýrmak istiyorsunuz: ");
		int vade = sc.nextInt();
		double toplam_para = tutar;
		double faiz= 0.06;
		for(int i=1; i<=vade; i++)
		{
			toplam_para= toplam_para + (tutar*faiz);
			System.out.println(i + ".yýlýn sonunda toplam para: " +toplam_para);
			
		}
	}

}
