import java.util.*;
class q5
{
	static int j = 0;
	static int sum = 0;
	static int add(String str,int len)
	{	
		if(j < len)
		{
			if(str.charAt(j) >= '0' && str.charAt(j) <= '9')
			{
			int num = Integer.parseInt(""+str.charAt(j));
			sum = sum + num;
			++j;
			}
			
			else
			{
			++j;	
			}
		}
		
		else if(j == len)
		{
		return sum;	
		}

	return add(str,len);
	}
	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String ");
	String s = sc.next();
	int len = s.length();
	System.out.println("Sum is "+add(s,len));	
	}
}