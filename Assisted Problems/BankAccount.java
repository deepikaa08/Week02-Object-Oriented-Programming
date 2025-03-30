class Account{
	int accountNumber;
	double balance;
	
	Account(int accountNumber, double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void displayAccountType(){
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account balance: "+balance);
	}
}

class SavingsAccount extends Account{
	int interestRate;
	SavingsAccount(int accountNumber, double balance, int interestRate){
		super(accountNumber, balance);
		this.interestRate=interestRate;
	}
	@Override
	void displayAccountType(){
		System.out.println("Account type: Savings Account");
		super.displayAccountType();
		System.out.println("Interest rate: "+interestRate+"%");
	}
}

class CheckingAccount extends Account{
	double withdrawalAmount;
	CheckingAccount(int accountNumber, double balance, double withdrawalAmount){
		super(accountNumber, balance);
		this.withdrawalAmount=withdrawalAmount;
	}
	@Override
	void displayAccountType(){
		System.out.println("Account type: Checking Account");
		super.displayAccountType();
		System.out.println("Withdrawal Amount: "+withdrawalAmount);
	}
}

class FixedDepositAccount extends Account{
	int maturityPeriod;
	FixedDepositAccount(int accountNumber, double balance, int maturityPeriod){
		super(accountNumber, balance);
		this.maturityPeriod=maturityPeriod;
	}
	@Override
	void displayAccountType(){
		System.out.println("Account type: Fixed Deposit Account");
		super.displayAccountType();
		System.out.println("Maturity period: "+maturityPeriod+" months");
	}
}

public class BankAccount{
	public static void main(String[] args){
		SavingsAccount acc1=new SavingsAccount(123, 50000.0, 5);
		CheckingAccount acc2=new CheckingAccount(456, 70000.0, 4500.0);
		FixedDepositAccount acc3=new FixedDepositAccount(789, 60000.0, 6);
		acc1.displayAccountType();
		System.out.println();
		acc2.displayAccountType();
		System.out.println();
		acc3.displayAccountType();
	}
}
