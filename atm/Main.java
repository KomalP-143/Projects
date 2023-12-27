package atm;

public class Main {

	public static void main(String[] args) {
		BankAccount UserAccount = new BankAccount(500);
		ATM atm = new ATM(UserAccount);
		atm.start();
	}

}

