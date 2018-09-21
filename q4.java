import java.util.*;
class q4
{
	static int j = 1;
	static int s;
	static int calculate(int x,int y,int z)
	{
		if(j < y)
		{	
		s = x*z;
		j++;
		}
		
		else if( j == y)
		{
		return s;	
		}
		
		else if(y == 0)
		return 1;
	
	else
	{
		if(y == 1)
		return x;	
	}
	return 	calculate(s,y,z);		
	}
	
	public static void main(String xx[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int x = sc.nextInt();
		
		System.out.print("Enter the number ");
		int y = sc.nextInt();
		final int z = x;
		System.out.println(x+"^"+y+" = "+calculate(x,y,z));
	}
}