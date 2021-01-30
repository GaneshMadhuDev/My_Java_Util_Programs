
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

    public void linkedListDemoExample() {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("TEXAS");

        linkedList.add("FLORIDA");

        linkedList.add("IOWA");

        linkedList.addFirst("NEW YORK");

        linkedList.add("CALIFORNIA");

        linkedList.add(3, "ILLINOIS");

        System.out.println(linkedList);

    }


}
