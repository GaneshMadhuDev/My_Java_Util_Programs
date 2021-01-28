/**
 * Created by ganeshmadhu on 1/28/21.
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * To apply resizable-array in addition to the implementation of the Deque interface.
 * It is also known as Array Double Ended Queue or Array Deck.
 *
 * Array deques have no capacity restrictions and they grow as necessary to support usage.
 */
public class ArrayDequeueDemo {

    public void arrayDequeueDemoExample() {

        Deque<String> statesDeque = new ArrayDeque<String>();

        statesDeque.add("TEXAS"); // add method to insert the state

        statesDeque.add("NEW YORK");

        statesDeque.addFirst("NORTH CAROLINA");

        statesDeque.addLast("ILLINOIS");

        statesDeque.addLast("CALIFORNIA");

        System.out.println("ArrayDequeue : " + statesDeque);

    }

}
