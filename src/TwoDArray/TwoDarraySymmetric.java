package TwoDArray;

public class TwoDarraySymmetric {

	public static void main(String[] args) 
	{
		int ar[][]= {{1,1,-1},{1,2,0},{-1,0,5}};
		int result[][]=new int[3][3];
		
		System.out.println("Original Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Form of the Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				result[i][j]=ar[j][i];
				System.out.print(ar[j][i]+" ");
			}
			System.out.println(" ");
		}
		int flag=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(ar[i][j]!=result[i][j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Symmetric Matrix");
		}
		else
		{
			System.out.println("Non Symmetric Matrix");
		}

	}

}
