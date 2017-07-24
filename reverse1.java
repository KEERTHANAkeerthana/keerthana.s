package guvi;

import java.util.Scanner;
                                                               
public class reverse1 {
	public static void main(String[] args)
	{
		int reversenum=0;
		int num=0;
		System.out.println("Enter the digit:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num !=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
			
		}
		System.out.println(+reversenum);
		sc.close();
	}
}
		