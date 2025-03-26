import java.util.Scanner;
class BankAccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	BankAccount(String accountHolder, int accountNumber, double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amt){
		if(amt>0){
			balance += amt;
			System.out.println(amt+" deposited successfully");
		}
		else{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amt){
		if(amt>0&&amt<=balance){
			balance-=amt;
			System.out.println(amt+" withdrawn successfully");
		}
		else if(amt>balance){
			System.out.println("Insufficient balance ");
		}
		else{
			System.out.println("Invalid amount");
		}
	}
	
	public void displayBalance(){
		System.out.println("Current balance: "+balance);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		BankAccount myAccount=new BankAccount("AAA", 123456, 10000.00);
		int choice;
		do{
			System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    myAccount.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
		while (choice != 4);
	}
}