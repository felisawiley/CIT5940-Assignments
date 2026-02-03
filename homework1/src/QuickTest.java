package homework1.src;

import java.util.ArrayList;
import java.util.LinkedList;

public class QuickTest {
    public static void main(String[] args) {
        // create both ArrayList<String> and LinkedList<String> queues
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        
        // add in 20k tickets
        for (int i = 1; i <= 20000; i++) {
            String ticket = "Ticket #" + i;
            linkedList.add(ticket);
            arrayList.add(ticket);
        }
        
        // time the LinkedList
        long start1 = System.nanoTime();
        while (!linkedList.isEmpty()) {
            linkedList.remove(0);
        }
        long linkedListTime = System.nanoTime() - start1;
        
        // reset ArrayList and run again
        for (int i = 1; i <= 15; i++) {
            arrayList.add("Ticket #" + i);
        }
        
        // time the ArrayList
        long start2 = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        long arrayListTime = System.nanoTime() - start2;
        
        // print out results
        System.out.println("Results for 15 tickets:");
        System.out.println("LinkedList time: " + linkedListTime + " ns");
        System.out.println("ArrayList time:  " + arrayListTime + " ns");
        System.out.println("LinkedList is " + (arrayListTime/linkedListTime) + "x faster");
    }
}