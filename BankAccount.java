package encapsulation_Assignment2;

public class BankAccount {
	
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(int ammonutasset1,int ammountasset2)
	{
		double balanceafterdeposit = ammonutasset1+ammountasset2;
		this.balance = balanceafterdeposit;
		System.out.println("Revised balance after deposit " +balance);
	}
	
	public  void withdraw(int amountasset1,int amountasset2)
	{
		double balanceafterwithdraw =amountasset1-amountasset2;
		this.balance = balanceafterwithdraw;
		System.out.println("Revised balance after withdraw " +balance);
	}
	
	public void printstatement()
	{
		System.out.println("Account number is " +accountNumber);
		System.out.println("Owner of Account is " +owner);
		
	}

}
