import java.util.Scanner;
class Palindrome{
	private String text;
	
	Palindrome(String text){
		this.text=text;
	}
	
	public boolean isPalindrome(){
		String string = text.replaceAll("[a-zA-Z0-9]","").toLowerCase();
		int left=0;
		int right=string.length()-1;
		while(left<right){
			if(string.charAt(left)!=string.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public void displayResults(){
		if(isPalindrome()){
			System.out.println(text+" is a palindrome");
		}
		else{
			System.out.println(text+" is not a palindrome");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String text=input.nextLine();
		Palindrome check=new Palindrome(text);
		check.displayResults();
	}
}
