package Hackerrank.test;

import java.util.Scanner;

public class CreateAnHourglass 
{

	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
        int arr[][]= new int[6][6];
        int sum=Integer.MIN_VALUE,n;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                arr[i][j]=sca.nextInt();
            }
        }
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
               n=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];                if(i==0 && j==0)
               {
                   sum=n;
               }
               else if(n>sum)
               {
                    sum=n; 
               }  
            }
        }
        System.out.println(sum);
        sca.close();
    }
}
        

	
