package guvi;
import java.util.*;

	public class digitpower 
	{
		public static void main (String[] args) throws java.lang.Exception
		{

			
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=0,d,e,f=0,g;
			
			int c=a;
			while(c>0)
			{
				c=c/10;
				b++;
			}
			g=a;
			while(g>0)
			{
				
				d=g%10;
				e=1;
				for(int i=1;i<=b;i++)
				{
					e=e*d;
				}
				
				f=f+e;
				g=g/10;
			}
			
			System.out.println(f);
			s.close();
		}
	}

