/**
 * Created by ganeshmadhu on 1/27/21.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The collection class basically contains EMPTY_LIST, EMPTY_SET, EMPTY_MAP,
 * which can be used to get an immutable empty List, Map, and Set respectively.
 *
 */
public class CollectionsDemo {

    public void collectionsDemoExample() {

        List<String> cities = new ArrayList<>();

        cities.add("NEW YORK");

        cities.add("CHICAGO");

        cities.add("DALLAS");

        Collections.addAll(cities, "MIAMI", "ATLANTA");

        cities.stream().forEach((city) -> {
            System.out.println("City Name - " + city);
        });

        Collections.sort(cities); // sort in ascending order

        cities.stream().forEach((city) -> {
            System.out.println("City Name - " + city);
        });

        Collections.sort(cities, Collections.reverseOrder()); // sort it in descending order

        cities.stream().forEach((city) -> {
            System.out.println("City Name - " + city);
        });

    }


}
