
public class Main {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Hesap hesap = new Hesap("Elif Nil", "123456", 300);
		
		atm.calis(hesap);
		System.out.println("Programdan çýkýlýyor..");
		

	}

}
