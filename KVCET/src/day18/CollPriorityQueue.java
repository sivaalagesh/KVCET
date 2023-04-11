package day18;

import java.util.PriorityQueue;

public class CollPriorityQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		pq.add(600);
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);

	}

}
