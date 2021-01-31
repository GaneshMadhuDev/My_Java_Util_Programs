/**
 * Created by ganeshmadhu on 1/30/21.
 */

import java.util.LinkedHashMap;

/**
 * HashMap provided the advantage of quick insertion, search, and deletion
 * but it never maintained the track and order of insertion which the LinkedHashMap
 * provides where the elements can be accessed in their insertion order.
 *
 * A LinkedHashMap contains values based on the key.
 * It contains only unique elements.
 * It is non-synchronized.
 * It  have one null key and multiple null values.
 *
 * It is the same as HashMap with an additional feature that it maintains insertion order.
 */
public class LinkedHashMapDemo {

    public void linkedHashMapDemoExample() {

        LinkedHashMap<String, String> linkedHashMap
                = new LinkedHashMap<String, String>();

        // Add mappings using put method
        linkedHashMap.put("student1", "Patrick");
        linkedHashMap.put("student2", "Jim");
        linkedHashMap.put("student3", "John");

        // It prints the elements in same order as they were inserted
        System.out.println(linkedHashMap);

        System.out.println("name of student1 : " + linkedHashMap.get("student1"));

        System.out.println("name of student2 : " + linkedHashMap.get("student2"));

        System.out.println("name of student3 : " + linkedHashMap.get("student3"));

        System.out.println("size of map : " + linkedHashMap.size());

        System.out.println("Is map empty? " + linkedHashMap.isEmpty());

        System.out.println("is Map contains student4? " + linkedHashMap.containsKey("student4"));


        System.out.println("delete element 'student1': " + linkedHashMap.remove("student1"));

        // print mappings to the console
        System.out.println("students  of LinkedHashMap : " + linkedHashMap);

    }

}
