import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bankam�za ho�geldiniz. G�ncel fazi oran� %6");
		System.out.println("Yat�rmak istedi�iniz tutar� giriniz: ");
		double tutar = sc.nextDouble();
		System.out.println("Ka� y�l vadeli yat�rmak istiyorsunuz: ");
		int vade = sc.nextInt();
		double toplam_para = tutar;
		double faiz= 0.06;
		for(int i=1; i<=vade; i++)
		{
			toplam_para= toplam_para + (tutar*faiz);
			System.out.println(i + ".y�l�n sonunda toplam para: " +toplam_para);
			
		}
	}

}
