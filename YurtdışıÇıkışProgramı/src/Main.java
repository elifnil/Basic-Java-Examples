
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sabiha G�k�en Havaliman�na ho�geldiniz....");
		String sartlar="----Yurtd��� ��k�� Kurallar�----\n"
				       + "Herhangi bir siyasi yasa��n�z bulunmamal�d�r.\n"
				       + "15 TL har� bedeli tam olarak �denmelidir.\n"
				       + "Vize i�lemlerinizin ba�ar�yla tamamlanm�� olmas� gerekmektedir. \n";
	    String message ="Yurtd��� ��k�� kurallar�n�n hepsi sa�lanmal�d�r..";
	    while(true) {
	    	System.out.println("------------------------");
	    	System.out.println(sartlar);
	    	System.out.println("------------------------");
	    	
	    	Yolcu yolcu1 = new Yolcu();
	    	System.out.println("Har� bedeli kontrol ediliyor..");
	    	Thread.sleep(3000);
	   
	    	if(yolcu1.yurtdisiHarciKontrol()==false) {
	    		System.out.println(message);
	    		continue;
	    	}
	    	System.out.println("Siyasi yasak kontrol ediliyor..");
	    	Thread.sleep(3000);
	    	
	    	if(yolcu1.siyasiYasakKontrol()==false) {
	    		System.out.println(message);
	    		continue;
	    		
	    		
	    	}
	    	
	    	System.out.println("Vize durumu kontrol ediliyor..");
	    	Thread.sleep(3000);
	    	
	    	if(yolcu1.vizeDurumuKontrol()==false) {
	    		System.out.println(message);
	    		continue;
	    	}
	    	System.out.println("��lemleriniz ba�ar�yla tamamlanm��t�r.Yurtd���na ��kabilirsiniz.");
	    	break;
	    	


	    }

	}

}
