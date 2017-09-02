package Collections.QueuePqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by melayer on 2/9/17.
 */
public class priorityQ {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<String>();
        q.add("e");
        q.add("d");
        q.add("c");
        q.add("b");
        q.add("a");

        System.out.println("head:"+q.element());
        System.out.println("head:"+q.peek());

        Iterator itr=q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        q.remove();
       q.poll();

        System.out.println("After removing 2 Elements");

        Iterator e=q.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }
    }
}
