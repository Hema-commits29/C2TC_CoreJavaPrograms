package collections2;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeRef {

	public static void main(String[] args) {
		
		ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        System.out.println("Deque: " + deque);
        
        deque.addFirst("Grapes");
        deque.addLast("Orange");
        
        deque.removeFirst();
        System.out.println("The first removed element is:" +deque.getFirst());
        //System.out.println("");
        
        Iterator<String> paz = deque.iterator();
        while(paz.hasNext()) {
        	String element = paz.next();
        	if(element.equals("Cherry")) {
        		paz.remove();
        		deque.add("Jackfruit");
        		
        	}
        }
        	System.out.println("Deque after replacing elements: " + deque);
	}

}
