package QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(111);
		pq.add(222);
		pq.add(333);
		pq.add(444);
		pq.add(555);
		pq.add(666);
	
		System.out.println(pq.peek());
		System.out.println();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		System.out.println();
		System.out.println(pq.peek());
		
		

	}

}
