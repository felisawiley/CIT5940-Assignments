package homework1.src;

import java.util.ArrayList;


public class TicketProcessorArray {
    private ArrayList<String> queue;

    // Constructor
    public TicketProcessorArray() {
        this.queue = new ArrayList<>();
    }

    public ArrayList<String> getQueue() {
        return queue;
    }

    public void setQueue(ArrayList<String> queue) {
        this.queue = queue;
    }


    // Adds a ticket on the end of our queue
    // O(1) removal

    public void addToQueue(String ticket) {
        queue.add(ticket);
    }

    // Removes and returns the next ticket but from the end
    // O(1) removal
    public String removeFromQueue(){
        if (queue.isEmpty()) {
            return null;
        }
        // return queue.remove(0);
        return queue.remove(queue.size() -1);
    }

    // Returns the number of tickets in the queue
    public int queueSize() {
        return queue.size();
    }

    // Empty queue boolean check
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        TicketProcessorArray test = new TicketProcessorArray();
        
        // add tickets in order
        test.addToQueue("Ticket #1");
        test.addToQueue("Ticket #2");
        test.addToQueue("Ticket #3");
        
        // remove from the back
        System.out.println(test.removeFromQueue()); // Ticket #3
        System.out.println(test.removeFromQueue()); // Ticket #2
        System.out.println(test.removeFromQueue()); // Ticket #1
    }
}
