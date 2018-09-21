import java.util.*;
class q1
{
	static int j = 0;
	static boolean search(int arr[],int num)
	{
		if(j < arr.length)
		{
			if(arr[j] == num)
			{
			System.out.println("Found at "+j+" position");
			return true;
			}
			
			else
			{
			++j;		
			}
		}
		
		else
		{
		return false;	
		}
	return search(arr,num);	
	}

	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.print("Enter the elements of array ");
		for(int i=0;i<n;i++)
		{
		arr[i] = sc.nextInt();	
		}
		
	System.out.print("Entered elements are ");	
	for(int i = 0;i<n;i++)
	System.out.print(arr[i]+" ");

	System.out.println();
	
	System.out.print("Enter the number to search ");
	int num = sc.nextInt();	
	System.out.println(search(arr,num));	
	}
}