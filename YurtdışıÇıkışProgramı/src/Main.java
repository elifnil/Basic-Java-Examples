
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sabiha Gökçen Havalimanýna hoþgeldiniz....");
		String sartlar="----Yurtdýþý Çýkýþ Kurallarý----\n"
				       + "Herhangi bir siyasi yasaðýnýz bulunmamalýdýr.\n"
				       + "15 TL harç bedeli tam olarak ödenmelidir.\n"
				       + "Vize iþlemlerinizin baþarýyla tamamlanmýþ olmasý gerekmektedir. \n";
	    String message ="Yurtdýþý çýkýþ kurallarýnýn hepsi saðlanmalýdýr..";
	    while(true) {
	    	System.out.println("------------------------");
	    	System.out.println(sartlar);
	    	System.out.println("------------------------");
	    	
	    	Yolcu yolcu1 = new Yolcu();
	    	System.out.println("Harç bedeli kontrol ediliyor..");
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
	    	System.out.println("Ýþlemleriniz baþarýyla tamamlanmýþtýr.Yurtdýþýna çýkabilirsiniz.");
	    	break;
	    	


	    }

	}

}
