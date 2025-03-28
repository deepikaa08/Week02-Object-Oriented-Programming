class Bankaccount{
	static String bankName="ABC Bank";
	static int totalAccounts=0;
	private final int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Bankaccount(int accountNumber, String accountHolder, double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
		totalAccounts++;
	}
	public static void getTotalAccounts(){
		System.out.println("Total number of accounts: "+totalAccounts);
	}
	public void displayDetails(){
		if(this instanceof Bankaccount){
			System.out.println("Bank name: "+bankName);
			System.out.println("Account holder name: "+this.accountHolder);
			System.out.println("Account number: "+this.accountNumber);
			System.out.println("Balance: "+this.balance);
		}
		else{
			System.out.println("Invalid account object");
		}
	}
	public int getAccountnumber(){
		return accountNumber;
	}
	public String getAccountholder(){
		return accountHolder;
	}
	public double getBalance(){
		return balance;
	}
}

public class Bank{
	public static void main(String[] args){
		Bankaccount acc1=new Bankaccount(001, "AAA", 50000);
		Bankaccount acc2=new Bankaccount(002, "BBB", 75000);
		acc1.displayDetails();
		System.out.println();
		acc2.displayDetails();
		Bankaccount.getTotalAccounts();
	}
}
