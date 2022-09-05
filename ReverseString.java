package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TestLeaf";
		char[] charArray = str.toCharArray();
		
		System.out.println("Actual String  : " + str);
		System.out.print("Reverse String : ");
		for (int i = charArray.length-1;i >=0;i--)
		{
			System.out.print(charArray[i]);
		}
		
		
	}

}
