package guvi;

import java.util.Scanner;

public class naturenumber {
	public static void main(String[] args)
	{
		int x,i=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		x=s.nextInt();
		while(i<=x)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of "+x+" numbers is :"+sum);
		s.close();
	}

}
