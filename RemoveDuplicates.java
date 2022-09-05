package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
		int count = 1;
		
		String[] split = text.split(" ");
		
		System.out.println("Actual String     : " + text);
		
		for (int i=0;i<split.length;i++)
		{
			for (int j=i+1; j<split.length;j++)
			{
				if (split[i].equalsIgnoreCase(split[j]))
						{
							count++;
						}
				if (count > 1)
				{
					split [j] = "";
					count = 1;
				}
			}
		}
		
		System.out.print("Remove Duplicates : ");
		
		for (int i=0;i<split.length;i++)
		{
			System.out.print(split[i] + " ");
		}
		
		
		
		
	
		
		

	}

}
