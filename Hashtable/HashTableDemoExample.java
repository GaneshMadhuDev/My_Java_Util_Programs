
import java.util.Hashtable;

/**
 * Created by ganeshmadhu on 1/25/21.
 *
 * It is similar to HashMap, but is synchronized.
 *
 * Hashtable stores key/value pair in hash table.
 *
 * HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
 */

public class HashTableDemoExample {


    public void hashTableExample() {

        Hashtable<Integer, String> zipCodeToCityHashTable = new Hashtable<>();

        Hashtable<String, Integer> cityToZipcodeHashTable = new Hashtable<>();

        zipCodeToCityHashTable.put(60563, "Naperville");

        zipCodeToCityHashTable.put(28208, "Charlotte");

        zipCodeToCityHashTable.put(07303, "JerseyCity");

        cityToZipcodeHashTable.put("naperville", 60563);

        cityToZipcodeHashTable.put("Charlotte", 28208);

        cityToZipcodeHashTable.put("JerseyCity", 07303);

        System.out.println("zipCode To City HashTable mapping " + zipCodeToCityHashTable);

        System.out.println("City To ZipCode HashTable mapping " + cityToZipcodeHashTable);
        
    }

}
