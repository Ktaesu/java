package f.object.ex2;

public class Run {
	
	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(5000);
		ref2.withdraw(6000);
		
		ref1.withdraw(7000);
		ref2.deposit(4000);
		
		ref1.checkMyBalance(10000);
		ref2.checkMyBalance(0);
	}

}
