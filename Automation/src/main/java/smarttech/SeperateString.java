package smarttech;

public class SeperateString {
	
	// How to seperate the Srting name and Number 
	
	public static void main(String[] args) {
		
		String name = "Reunion2022";
		String value = name.replaceAll("[^A-Za-z]", "");
		System.out.println(value);
		String num = name.replaceAll("[^0-9]", "");
		System.out.println(num);
		
		
	}
	
	

}
