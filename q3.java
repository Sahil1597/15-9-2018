import java.util.*;
class q3
{
	static int count = 1;
	public static int find(int a,int b,int num)
	{
		
		int c;
		
		if(count == num)
		return a;

		else
		{
			c = a+b;
			a = b;
			b = c;
			
		count++;
		return find(a,b,num);	
		}
	}
	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number ");
	int num = sc.nextInt();
	
	System.out.println("Number at "+num+" is "+find(0,1,num));
	}
}