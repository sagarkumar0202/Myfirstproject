package TwoDArray;

public class TwoDArrayTransposeForm 
{

	public static void main(String[] args) 
	{
		int ar[][]= {{12,13,14},{15,16,17},{18,19,20}};
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
				System.out.print(ar[j][i]+" ");
			}
			System.out.println();
		}

	}

}
