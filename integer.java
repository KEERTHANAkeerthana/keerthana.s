package guvi;

import java.util.Scanner;

public class integer {
	public static void main(String[] args)
	{
	int intoInt;
	String s;
	Scanner scan=new Scanner(System.in);
	s=scan.next();
	intoInt=Integer.parseInt(s);
	System.out.println("This is an integer: "+intoInt);
	scan.close();
	}
	}


