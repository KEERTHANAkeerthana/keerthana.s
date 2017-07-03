package guvi;

import java.util.Scanner;

public class perfectornot {
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		int perfectNo = 0;
		int i;
		System.out.println("Factors are:");
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				perfectNo += i;
				System.out.println(i);
			}
		}
		if (perfectNo == num) {
			System.out.println("number is a perfect number");
		} else {
			System.out.println("number is not a perfect number");
			s.close();
		}
	}
}
	


