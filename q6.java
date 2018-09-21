import java.util.*;
class q6
{
	static String str1 = "";
	static String remove(String str,int len,int i)
	{
		if(i == len-1)
		{
			str1 += str.charAt(i);
			return str1;
		}
		
		else if(i <len-1)
		{
			if(str.charAt(i) != str.charAt(i+1))
			{
			str1 += str.charAt(i);
			}
		}
	return remove(str,len,++i);
	}
	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String ");
	String s = sc.nextLine();
	int len = s.length();
	System.out.println("After removing consecutive dupicates = "+remove(s,len,0));
	}

}
