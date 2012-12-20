import static org.junit.Assert.*;
import org.junit.Test;
import static koan.Constants.*;
import java.util.*;
/**
 * Write a description of class AboutHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AboutHashMap
{

//  Ex 5.25 How do you check how many entries are contained in a map?

@Test
public void checkHowManyEntries(){
    HashMap<String,String> phoneBook = new HashMap<String,String>();
    phoneBook.put("Trick","908234");
    phoneBook.put("Tick","2837453");
    phoneBook.put("Track","089234590");
    assertEquals("this map has 3 entries",3,phoneBook.size());
    
}

//Ex 5.27 What happens if you add an entry to a map with a key that already exists in the map?
@Test
public void addKeyThatAlreadyExists(){
    // vorbereitung - "fixture"
    HashMap<String,String> phoneBook = new HashMap<String,String>();
    phoneBook.put("Trick","908234");
    phoneBook.put("Tick","2837453");
    phoneBook.put("Track","089234590");
    // add something with existing key
    phoneBook.put("Tick","new phonenumber");
    
    assertEquals("now the map has 3 entries",3,phoneBook.size());
    assertEquals("existing entry is overwritten","new phonenumber",phoneBook.get("Tick"));
    
}
// Ex 5.30 What happens when you try to look up a value and the key does not exist in the map?

@Test
public void lookUpNonExistingKey(){
    // vorbereitung - "fixture"
    HashMap<String,String> phoneBook = new HashMap<String,String>();
    phoneBook.put("Trick","908234");
    phoneBook.put("Tick","2837453");
    phoneBook.put("Track","089234590");
    assertEquals("looking up nonexistent key returns null",null,phoneBook.get("Truck"));
    
}
/*
Ex 5.26 Create a class MapTester and use a HashMap in it to implement a phone book with the following methods:
public void enterNumber(String name, String number)
public void lookupNumber(String name)
The methods should use the put and get methods of the HashMap class to implement their functionality
*/
/*
 * Ex 5.28 What happens when you add an entry to a map with two different keys?
Ex 5.29 How do you check whether a given key is contained in a map? (Give a java code example)
Ex 5.30 What happens when you try to look up a value and the key does not exist in the map?
Ex 5.31 How do you check how many entries are contained in a map?
Ex 5.32 How do you print out all keys currently stored in a map?
 */

}
