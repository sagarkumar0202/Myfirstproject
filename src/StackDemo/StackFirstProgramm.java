package StackDemo;

import java.util.Stack;

public class StackFirstProgramm 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.push(55);
		s.push(66);
		s.push(77);
		
		s.pop();
		s.removeElement(22);
		System.out.println(s.peek()); //It will return the TOS
		System.out.println();
		
		System.out.println(s.search(33));
		System.out.println();
		for(Integer i:s)
		{
			System.out.println(i);
		}
		System.out.println(s.isEmpty());
	}

}
