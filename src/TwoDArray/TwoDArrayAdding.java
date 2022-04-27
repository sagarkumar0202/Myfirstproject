package TwoDArray;

public class TwoDArrayAdding {

	public static void main(String[] args) 
	{
		int ar[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int arr[][]= {{120,130,140},{150,160,170},{180,190,200}};
		int result[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				result[i][j]=arr[i][j]/ar[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
