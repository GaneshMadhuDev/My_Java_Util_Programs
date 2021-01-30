
import java.util.LinkedList;

/**
 * Created by ganeshmadhu on 1/30/21.
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
