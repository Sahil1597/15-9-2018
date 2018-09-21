import java.util.*;
class q2
{
	static int j = 0;
	static void reverse(int arr[],int size)
	{
		if(j < size/2)
		{	
			int temp = arr[j];
			arr[j] = arr[size-j-1];
			arr[size-j-1] = temp;
			
		++j;	
		reverse(arr,size);  
		}
		
	}
		static void display(int arr[],int size)
		{
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}			
	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.print("Enter the elements of array ");
	for(int i=0;i<n;i++)
	arr[i] = sc.nextInt();	
	
	System.out.print("Elements are ");
	for(int s:arr)
	System.out.print(s+" ");	
	
	System.out.println();
	reverse(arr,n);
	System.out.print("After reversing ");
	display(arr,n);
	}
}