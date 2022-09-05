package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Step on no pets", rev = "";
		
		System.out.println("Actual String  : "+str);
				
		for (int i = str.length()-1; i>=0;i--)			
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reverse String : "+rev);
		if (str.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrome.");
		}
		else
		{
			System.out.println("String is Not Palindrome.");
		}
		

	}

}
