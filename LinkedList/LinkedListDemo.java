
import java.util.LinkedList;

/**
 * Created by ganeshmadhu on 1/30/21.
 */

/**
 * which is a linear data structure where the elements are not stored in contiguous locations
 * and every element is a separate object with a data part and address part.
 * The elements are linked using pointers and addresses.
 * Each element is known as a node.
 * Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
 */
public class LinkedListDemo {

    public void linkedListDemoExample1() {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("TEXAS");

        linkedList.add("FLORIDA");

        linkedList.add("IOWA");

        linkedList.addFirst("NEW YORK");

        linkedList.add("CALIFORNIA");

        linkedList.add(3, "ILLINOIS");

        System.out.println(linkedList);

    }

    /**
     * To change the Existing elements we use set in LL.
     */

    public void linkedListDemoExample2() {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("TEXAS");

        linkedList.add("FLORIDA");

        linkedList.add("IOWA");

        linkedList.addFirst("NEW YORK");

        linkedList.addLast("CALIFORNIA");

        linkedList.add(3, "ILLINOIS");

        System.out.println(linkedList); // [NEW YORK, TEXAS, FLORIDA, ILLINOIS, IOWA,  CALIFORNIA]

        linkedList.set(2, "OHIO");

        System.out.println(linkedList); // [NEW YORK, TEXAS, OHIO, ILLINOIS, IOWA,  CALIFORNIA]

    }

    /**
     * peek() ==> This method retrieves, but does not remove, the head (first element) of this list.
     *
     * peekFirst() ==> This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
     *
     * peekLast() ==> This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
     *
     */

    public void linkedListDemoExample2() {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("TEXAS");

        linkedList.add("FLORIDA");

        linkedList.add("IOWA");

        linkedList.addFirst("NEW YORK");

        linkedList.addLast("CALIFORNIA");

        linkedList.add(3, "ILLINOIS");

        System.out.println(linkedList); // [NEW YORK, TEXAS, FLORIDA, ILLINOIS, IOWA,  CALIFORNIA]

        System.out.println(linkedList.peek()); // NEW YORK

        System.out.println(linkedList.peekFirst()); // NEW YORK

        System.out.println(linkedList.peekLast()); // CALIFORNIA

    }

    /**
     * get(int index) ==> This method returns the element at the specified position in this list.
     *
     * getFirst() : This method returns the first element in this list.
     *
     * getLast() : This method returns the last element in this list.
     *
     */

    public void linkedListDemoExample3() {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("TEXAS");

        linkedList.add("FLORIDA");

        linkedList.add("IOWA");

        linkedList.addFirst("NEW YORK");

        linkedList.addLast("CALIFORNIA");

        linkedList.add(3, "ILLINOIS");

        System.out.println(linkedList); // [NEW YORK, TEXAS, FLORIDA, ILLINOIS, IOWA,  CALIFORNIA]

        System.out.println(linkedList.get(2)); // FLORIDA

        System.out.println(linkedList.getFirst()); // NEW YORK

        System.out.println(linkedList.getLast()); // CALIFORNIA

    }

}
