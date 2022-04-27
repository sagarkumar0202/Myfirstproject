package ArrayProgram;
public class BubbleShort 
{
	public static void main(String[] args) 
	{
		int ar[]= {45,23,11,4,89,33,1,8,44};
		int temp;
		System.out.println("Before Sorting:");
		for(int i=0;i<ar.length;i++)
		{
		  System.out.print(ar[i]+" ");	
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
				  temp=ar[i];
				  ar[i]=ar[j];
				  ar[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting:");
		for(int i=0;i<ar.length;i++)
		{
		  System.out.print(ar[i]+" ");	
		}
		}
	}
