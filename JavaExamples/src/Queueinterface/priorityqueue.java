package Queueinterface;

import java.util.PriorityQueue;

public class priorityqueue {
	
	public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		queue.add("Ravi");
		queue.add("Raj");
		queue.add("Jayshankar");
		queue.add("Ramesh");
		System.out.println(queue);
		System.out.println("Head of the queue" + queue.element());
		System.out.println("Head of the queue" +queue.peek());
		queue.remove();
		System.out.println("Updated queue elements are " + queue);
		queue.poll();
		System.out.println("Updated elemenets of queue are " + queue);
		queue.contains("ramesh");
	}

}
