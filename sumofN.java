package guvi;

import java.util.Scanner;

public class sumofN {
	public static void main(String[] args)
	{
		int x,sum=0;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		System.out.println("Enter the number");
		for(int i=1;i<x;i++)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of "+x+" numbers is :"+sum);
		s.close();
	}

}
