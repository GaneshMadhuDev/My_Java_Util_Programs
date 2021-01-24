/**
 * Created by ganeshmadhu on 1/24/21.
 */

import java.util.EnumMap;

/**
 * EnumMap class is a member of the Java Collections Framework & is not synchronized.
 *
 * It’s a high-performance map implementation, much faster than HashMap.
 *
 * EnumMap doesn’t allow null key and throws NullPointerException when we attempt to insert the null key.
 */
public class EnumMapDemo {

    // Creating an Enum
    public enum Months {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public void enumMapDemoExample() {

        EnumMap<Months, String> enumMap = new EnumMap<Months, String>(Months.class);

        enumMap.put(Months.January, "10th");
        enumMap.put(Months.February, "15th");
        enumMap.put(Months.March, "20th");
        enumMap.put(Months.April, "25th");
        enumMap.put(Months.May, "30th");

        for (EnumMap.Entry map : enumMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}
