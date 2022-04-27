package Hackerrank.test;

import java.io.*;

public class ForLoopTableProgram 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Input which Table You Need to Display");
    int N = Integer.parseInt(bufferedReader.readLine());
    
    
   if(N>=2||N<=20)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+N*i );
        }
    }
    bufferedReader.close();
}
}