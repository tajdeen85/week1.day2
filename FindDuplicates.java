package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {12, 25, 12, 56, 89, 25} ;
		
		Arrays.sort(nums);
		
		for (int i = 0;i<nums.length;i++)			
		{
			for (int j =i+1;j<nums.length;j++)
			{
				if (nums[i] == nums [j])
				{
					System.out.println(nums[i]);
				}
			}

		}
		

	}

}
