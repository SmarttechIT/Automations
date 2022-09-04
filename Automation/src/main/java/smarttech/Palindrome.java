package smarttech;

public class Palindrome {
	
	//How to Palindrome
	public static void main(String[] args) {
		
	
		String a ="KJAM";
		String reverse ="";
		      // inalization, conditions , decrement
		for(int i=a.length()-1; i>0; i--) {
			reverse +=a.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		
		if(palindrome) {
			
			System.out.println("I am Palindrome");
			
		}else 
			System.out.println(" I am not Palindrome");
		
	}
	
}

