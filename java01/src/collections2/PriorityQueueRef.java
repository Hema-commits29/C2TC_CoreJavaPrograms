package collections2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRef {

	public static void main(String args[]) {
		Queue<String> srf= new PriorityQueue();

		srf.add("Core Java");
		srf.add("React");
		srf.add("HTML");
		srf.add("CSS");

		System.out.println(srf);
		srf.remove("Angular");

		System.out.println("After Remove " + srf);

		System.out.println("Poll Method " + srf.poll());

		System.out.println("Final Queue " + srf);

		Iterator<String> iterator = srf.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		
		System.out.println(srf.peek());
		System.out.println(srf.poll());
		System.out.println(srf.peek());
	}


}