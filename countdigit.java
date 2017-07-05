package guvi;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args)
	{
		int count=0,number;
		Scanner s=new Scanner(System.in);
		number = s.nextInt();
		System.out.println("Enter the numbers");
		while(number > 0) {
			number = number / 10;
			count = count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", count);
		s.close();
	}
}
	


