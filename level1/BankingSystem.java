interface Loanable{
	void applyForLoan(double amount);
	double calculateLoanEligibility();
}

abstract class BankAccount{
	private String accountNumber;
	private String holderName;
	private double balance;
	
	public BankAccount(String accountNumber, String holderName, double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public String getHolderName(){
		return holderName;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(){
		this.balance=balance;
	}
	public void deposit(double amount){
		if(amount> 0){
			balance+=amount;
			System.out.println(amount+" deposited. New balance: "+balance);
		}
		else{
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance-=amount;
			System.out.println(amount+" withdrawn. New balance "+balance);
		}
		else{
			System.out.println("Invalid withdraw amount");
		}
	}
	public abstract double calculateInterest();
	
	public void displayDetails(){
		System.out.println("Account number: "+accountNumber);
		System.out.println("Holder name: "+holderName);
		System.out.println("Balance: "+balance);
	}
}

class SavingsAccount extends BankAccount implements Loanable{
	private double interestRate=0.04;
	
	public SavingsAccount(String accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
	@Override
	public double calculateInterest(){
		return getBalance()*interestRate;
	}
	@Override
	public void applyForLoan(double amount){
		System.out.println("Savings Account Loan applied  for amount: "+amount);
	}
	@Override
	public double calculateLoanEligibility(){
		return getBalance()*2;
	}
}

class CurrentAccount extends BankAccount implements Loanable{
	private double interestRate=0.02;
	
	public CurrentAccount(String accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
	@Override 
	public double calculateInterest(){
		return getBalance()*interestRate;
	}
	@Override
	public void applyForLoan(double amount){
		System.out.println("Current account loan applied for amount: "+amount);
	}
	@Override
	public double calculateLoanEligibility(){
		return getBalance()*3;
	}
}

public class BankingSystem{
	public static void main(String[] args){
		BankAccount acc1=new SavingsAccount("SA123", "AAA", 5000.0);
		BankAccount acc2=new CurrentAccount("CA456", "BBB", 10000.0);
		BankAccount[] accounts={acc1, acc2};
		for(BankAccount account : accounts){
			System.out.println("Account Details");
			account.displayDetails();
			double interest=account.calculateInterest();
			System.out.println("CalculatednInterest: "+interest);
			if(account instanceof Loanable){
				Loanable loanAcc=(Loanable)account;
				loanAcc.applyForLoan(2000);
				System.out.println("Loan Eligibility: "+loanAcc.calculateLoanEligibility());
				System.out.println();
			}
		}
	}
}
