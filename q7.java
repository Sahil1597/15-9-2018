import java.util.Scanner;
class demo
{
	private char brackets[];
	private int index;
	
	demo(String str)
	{
		brackets = new char[str.length()];
		index = -1;
	}
	
	public boolean cal(String str,int i,int len)
	{
		if((i == len && index == -1) || len == 0)
			return true;
		else if(i == len && index > -1)
			return false;
		else
		{
			char ch = str.charAt(i);
				if(index > -1 && ch == ']' && brackets[index] == '[')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == '}' && brackets[index] == '{')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == ')' && brackets[index] == '(')
				{
					brackets[index] = ' ';
					index--;
				}
			
			else if(ch=='[' || ch=='{' || ch=='(' || ch==']' || ch=='}' || ch==')')
			{
				index++;
				brackets[index] = str.charAt(i);
			}
			return cal(str,++i,len);
		}
	}

}
class q7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an expression : ");
		String str = sc.nextLine();
		demo s = new demo(str);
		
		int len = str.length();
		System.out.println("\nBalanced Brackets = " + s.cal(str,0,len));
		sc.close();
	}
}