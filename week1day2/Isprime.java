package week1day2;

public class Isprime {
	public static void main(String[] args) {

		int n=7;
		
		for(int i=2;i<= n-1; i++) 
		{
			if(n % i==0)     
			{
				System.out.println(n +" " + "is not a prime number");
				break;
			}
		
		   if(i==n-1)  
			{
				System.out.println(n +" " + "is a prime number");
				
			}
			
	    }
	}
}
