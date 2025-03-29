import java.util.ArrayList;
import java.util.List;
class Account{
	private static int accountCounter=101;
	private int accountNumber;
	private double balance;
	private Bank bank;
	public Account(Bank bank, double initialDeposit){
		this.accountNumber=accountCounter++;
		this.bank=bank;
		this.balance=initialDeposit;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public Bank getBank(){
		return bank;
	}
	public void deposit(double amount){
		balance+= amount;
		System.out.println("Deposited "+amount+" into account "+accountNumber);
	}
	public void withdraw(double amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("Withdrawn "+amount+" from account "+accountNumber);
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
}
class Customer{
	private String name;
	private List<Account> accounts;
	
	public Customer(String name){
		this.name=name;
		this.accounts=new ArrayList<>();
	}
	public String getName(){
		return name;
	}
	public void addAccount(Account acc){
		accounts.add(acc);
	}
	public void viewBalance(){
		System.out.println(name+"'s account balance: ");
		for(Account accs: accounts){
			System.out.println("Account number: "+accs.getAccountNumber()+", Balance: "+accs.getBalance()+", Bank: "+accs.getBank().getName());
		}
		System.out.println();
	}
}
class Bank{
	private String name;
	private List<Customer> customers;
	
	public Bank(String name){
		this.name=name;
		this.customers=new ArrayList<>();
	}
	public String getName(){
		return name;
	}
	public void openAccount(Customer customer, double initialDeposit){
		Account newAccount=new Account(this, initialDeposit);
		customer.addAccount(newAccount);
		if(!customers.contains(customer)){
			customers.add(customer);
		}
		System.out.println("Account opened for "+customer.getName()+" at "+name+" with initial deposit of "+initialDeposit);
	}
}
public class BankSystem{
	public static void main(String[] args){
		Bank b1=new Bank("National Bank");
		Customer c1=new Customer("Alice");
		Customer c2=new Customer("Bob");
		b1.openAccount(c1, 50000);
		b1.openAccount(c1, 30000);
		b1.openAccount(c2, 60000);
		c1.viewBalance();
		c2.viewBalance();
	}
}
