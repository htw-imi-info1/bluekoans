
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import static koan.Constants.*;
/**
 * The test class AboutCollectionsTest.
 *
 * @author  Barbara Kleinen
 * @version 25.11.11
 * adaption of AboutCollections Java Koan by Mat Bentley
 * @see https://github.com/matyb/java-koans
 */
public class AboutCollections
{
    @Test
    public void usingAnArrayList() {
        // List = interface
        // The generic syntax and special generic cases will be handled in
        // AboutGenerics. We just use <String> collections here to keep it
        // simple.
        List<String> list = new ArrayList<String>();
        // ArrayList: simple List implementation
        list.add("Chicken");
        list.add("Dog");
        list.add("Chicken");
        assertEquals(list.get(0), "Chicken");
        assertEquals(list.get(1), "Dog");
        assertEquals(list.get(2), "Chicken");
    }

    @Test
    public void usingABasicSet() {
        Set<String> set = new HashSet<String>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog");
        assertEquals(__,set.size());
        assertEquals(__,set.contains("Dog"));
        assertEquals(__,set.contains("Cat"));
        assertEquals(__,set.contains("Chicken"));
    }

    @Test
    public void usingABasicMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first key", "first value");
        map.put("second key", "second value");
        map.put("first key", "other value");
        assertEquals(__,map.size());
        assertEquals(__,map.containsKey("first key"));
        assertEquals(__,map.containsKey("second key"));
        assertEquals(__,map.containsValue("first value"));
        assertEquals(__,map.get("first key"));
    }

    @Test
    public void usingBackedArrayList() {
        String[] array = {"a","b","c"};
        List<String> list = Arrays.asList(array);
        list.set(0, "x");
        assertEquals(__,array[0]);
        array[0] = "a";
        assertEquals(__,list.get(0));
        // Just think of it as quantum state teleportation...
    }

}


