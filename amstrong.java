package guvi;

import java.util.Scanner;

public class amstrong {
	 public static void main(String args[])
	    {
	        int n, nu, num=0, rem;
	        Scanner s = new Scanner(System.in);
			
	        System.out.print("Enter any Positive Number : ");
	        n = s.nextInt();
			
	        nu = n;
			
	        while(nu != 0)
	        {
	            rem = nu%10;
	            num = num + rem*rem*rem;
	            nu = nu/10;
	        }
	        if(num == n)
	        {
	            System.out.print("Armstrong Number");
	        }
	        else
	        {
	            System.out.print("Not an Armstrong Number");
	            s.close();
	        }
	    }
	}


