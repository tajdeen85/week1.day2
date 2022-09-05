package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String text = "changeme";
		char[] charArray = text.toCharArray();
		
		System.out.println("Actual Word : " + text);
		
		for (int i = 0;i<charArray.length;i = i+2)
		{			
			charArray[i] = 	Character.toUpperCase(charArray[i]);				
						
		}
		
		System.out.print("Change Odd Index to Uppercase : ");
		
		for (int j = 0; j < charArray.length;j++)
		{
			System.out.print(charArray[j]);
		}
	
	}
}
