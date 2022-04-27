package Hackerrank.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListd 
{

	public static void main(String[] args) 
	{
		   Scanner scan=new Scanner(System.in);
	        int N;
	        N=scan.nextInt(); //Size of arrayList
	        
	ArrayList<Integer> L=new ArrayList<Integer>();//Declaration of arrayList
	        
	        if(N>0 && N<=4000)
	        {
	        for(int i=0;i<N;i++)  //Initialize then arraylist from the user input
	        {
	            int a=scan.nextInt();
	            L.add(a);
	        }
	        }
	        
	        int Q=scan.nextInt();
	        if(Q>0 && Q<=4000)
	        {
	            for(int i=1;i<=Q;i++)
	            {
	            String s=scan.next();
	            
	            if(s.equals("Insert"))
	            {
	                int x=scan.nextInt();
	                int y=scan.nextInt();
	                L.add(x,y);
	            }
	            if(s.equals("Delete"))
	            {
	                int x=scan.nextInt();
	                L.remove(x);
	            }
	            }                
	        }
	        
	        for(Integer i:L)
	        {
	            System.out.print(i+ " ");
	        }
	        
	        
	        
	        
	        
	        
	        
	    }

	}
