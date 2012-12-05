import static org.junit.Assert.*;
import org.junit.Test;
import static koan.Constants.*;
/**
 * Write a description of class AboutKoans here.
 * 
 * @author Barbara Kleinen
 */
public class AboutKoans
{
    @Test
    public void aboutAssertions(){
        // Assertions come from the JUnit test framework and are used
        // to write automated test. That is, if you want to test 
        // integer additions, instead of printing out the result,
        // you write an assertion automating the checking for you, e.g.:
        int actualResult = 3+4;
        int expected = 7;
        assertEquals("3 + 4 should be 7",expected,actualResult);
    }

    @Test
    public void aboutUsingAssertionsInKoans(){
        // in the koans, you use assertions to learn about Java.
        // sometimes there are blanks which you have to fill out
        // with your expectations - what you think the value will be.
        // for example, here you have to figure out what 3+4 evaluates
        // to and fill in the correct result:
        assertEquals("+ is integer addition:",___, 3+4);
        // and here, what the string concatenation produces:
        assertEquals("applied to strings, + is string concatenation",____,"ha"+"llo");
        assertEquals("expressions are evaluated from left to right",____, 47+11+" K");
    }

}
