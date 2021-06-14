package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Integer::compare);
        q.offer(7);
        q.offer(9);
        System.out.println(q);
        q.offer(1);
        q.offer(6);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
