package Week3day1;

import java.util.Arrays;

public class missingvalue {
	public static void main(String[] args) {
		int Marray[] = {1,4,3,2,8,6,7};
		Arrays.sort(Marray);
		int length = Marray.length;
		for (int i = 0; i < length; i++) 
		{
			if(Marray[i]!=i+1)
			{
				System.out.println("Missing number is " +(i+1));
				break;
			}
			
				
		}
		
	}
}
