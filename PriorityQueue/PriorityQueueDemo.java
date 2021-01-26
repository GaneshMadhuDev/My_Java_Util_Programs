
/**
 * Created by ganeshmadhu on 1/26/21.
 */

import java.util.PriorityQueue;

/**
 * PriorityQueues doesn’t allow null.
 *
 * The head of this queue is the least element with respect to the specified ordering.
 * If multiple elements are tied for least value,
 * the head is one of those elements — ties are broken arbitrarily.
 */
public class PriorityQueueDemo {

    public void priorityQueueDemoExample() {

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.add("MOON");// Adding elements to Pqueue

        priorityQueue.add("SUN");

        priorityQueue.add("EARTH");

        priorityQueue.add("SATURN");

        System.out.println(priorityQueue.peek()); // top element of pqueue

        System.out.println(priorityQueue); //prints the pqueue

    }

}
