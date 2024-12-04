package Collection;

import java.util.*;

public class DemoQueue {
    public static void main(String[] args) {
     ArrayDeque<Integer> test = new ArrayDeque<>();
     // adding elements
     test.add(1);
     test.add(2);
     test.add(3);
     test.offer(4);
        System.out.println(test);

// remove elements
        test.remove();
        System.out.println(test);
        test.pop();
        System.out.println(test);

        //top most element
        System.out.println(test.element());
        System.out.println(test.peek());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(23);
        pq.add(2);
        System.out.println(pq); //1, 2, 23, 3
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " "); //1 2 3 23
        }
    }
}
