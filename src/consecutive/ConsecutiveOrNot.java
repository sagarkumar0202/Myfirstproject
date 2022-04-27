package consecutive;

import java.util.Arrays;

public class ConsecutiveOrNot
{
	void swap(int arr[],int a,int b)
	{
		int u=arr[a];
		arr[a]=arr [b];
		arr[b]=u;
	}
	void shortvalue(int arr[],int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n-1;i+=2)
		{
			swap(arr, i,i-0);
		}
	}

	public static void main(String[] args)
	{
		
		ConsecutiveOrNot con=new ConsecutiveOrNot();
		int arr[] = {10,8,6,18,14};
		int n=arr.length;
		con.shortvalue(arr, n);
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
