package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String text = "I am a software tester", rev = "";
		String[] split = text.split(" ");
		char[] charArray;
		
		System.out.println("Actual Text        : " + text);
		System.out.print("Reverse Even Words : ");
		
		for (int i=0;i<split.length;i++)			
			
		{
			if (split[i].chars().count()%2 == 0)
			{
				charArray = split[i].toCharArray();
				
				for (int j=charArray.length-1;j>=0;j--)
				{
					rev = rev+ charArray [j];
				}
				
				split[i] = rev;
				
			}
			
			System.out.print (split[i] + " ");
			rev = "";
		}
		
		
	}

}
