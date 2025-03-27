class Bankaccount{
	public String accountNumber;
	protected String accountHolder;
	private double balance;
	
	public Bankaccount(String accountNumber, String accountHolder, double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		if(balance>=0){
			this.balance=balance;
		}
		else{
			System.out.println("Invalid balance");
		}
	}
	public void displayDetails(){
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account holder: "+accountHolder);
		System.out.println("Balance: "+balance);
	}
}
class Savingsaccount extends Bankaccount{
	private double interestRate;
	
	public Savingsaccount(String accountNumber, String accountHolder, double balance, double interestRate){
		super(accountNumber, accountHolder, balance);
		this.interestRate=interestRate;
	}
	public void displaySavingsdetails(){
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account holder: "+accountHolder);
		System.out.println("Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate+" %");
	}
}
public class BankSystem{
	public static void main(String[] args){
		Bankaccount acc=new Bankaccount("1234567890", "Alice", 5000);
		acc.displayDetails();
		System.out.println();
		acc.setBalance(10000);
		System.out.println("Updated balance: "+acc.getBalance());
		Savingsaccount acc1=new Savingsaccount("0987654321", "Bob", 10000, 3.5);
		acc1.displaySavingsdetails();
	}
}
