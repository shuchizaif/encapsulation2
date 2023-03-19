package encapsulation_Assignment2;

public class Base {

	
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.setAccountNumber("123456");
		obj.setBalance(100000);
		obj.setOwner("Aryen");
		obj.deposit(2000, 150);
		obj.withdraw(3000, 1500);
		obj.printstatement();
	
	
	
		
	
	
	
	
	}

}
