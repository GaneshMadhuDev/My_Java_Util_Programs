/**
 * Created by ganeshmadhu on 1/24/21.
 */

import java.util.EnumSet;
import java.util.Iterator;

/**
 * It extends AbstractSet class and implements Set Interface in Java.
 *
 * EnumSet class is a member of the Java Collections Framework & is not synchronized.
 *
 * It’s a high performance set implementation, much faster than HashSet.
 */
public class EnumSetDemo {

    enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY };

    public void enumSetDemoExample() {

        // CREATING AN ENUM SET

        EnumSet<Days> daysSet1 = EnumSet.allOf(Days.class);

        EnumSet<Days> daysSet2 = EnumSet.noneOf(Days.class);

        daysSet2.add(Days.MONDAY);

        System.out.println("EnumSet using add in daysSet2" + daysSet2);

        Iterator<Days> daysIterator = daysSet1.iterator();

        while (daysIterator.hasNext()) {

            System.out.println(daysIterator.next() + " - ");

        }

    }

}
