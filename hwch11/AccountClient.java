package hwch11;
public class AccountClient {
	double amount;
	double transferCost;
	public void withDraw(Account account, double amount) {
		   if (amount > account.getBalance() ) {
			   System.out.println("Yetersiz Bakiye");
				return;
		   }
		   System.out.println(amount + "Para yatirma isleminiz basariyla gerceklesti" + "  Guncel Bakiyeniz: " + from.getBalance());
	}
	 public void deposit(Account account, double amount) {
		 System.out.println(amount + "Para cekme isleminiz basariyla gerceklesti"+ "  Guncel Bakiyeniz: " + from.getBalance());
		 return;
	 }
	 public void transfer(Account from, Account to, double account) {
		 if(from.getBalance()< (amount + transferCost)){
		 System.out.println("Yetersiz Bakiye" + "  Guncel Bakiyeniz: " + from.getBalance());
		 return;
	 }
	 
	 System.out.println(amount + "Para transfer isleminiz basariyla gerceklesti" + "  Guncel Bakiyeniz: " + from.getBalance());
	 
	 }
	 
}
