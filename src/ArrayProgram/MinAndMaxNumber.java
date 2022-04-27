package ArrayProgram;
public class MinAndMaxNumber 
{
	public static void main(String[] args) 
	{
		 int ar[] = {10,14,15,16,16,17,18,21,22};
		 int max,min;
		 max=ar[0];
		 min=ar[0];
		 for(int i=1;i<ar.length;i++)
		 {
			 if(ar[i]>max)
			 {
				 max=ar[i];
			 }
		 }
		 for(int i=1;i<ar.length;i++)
		 {
			 if(ar[i]<min)
			 {
				 min=ar[i];
			 }
		 }
		 System.out.println("Maximum "+  max);
		 System.out.println("Minimum  "+ min);
	}
}
