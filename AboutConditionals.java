import static org.junit.Assert.*;
import org.junit.Test;
import static koan.Constants.*;
/**
 * AboutConditionalsTest.
 *
 * @author  Barbara Kleinen
 */
public class AboutConditionals
{
 

    @Test
    public void aboutConditionals(){
        int x = 0;
        if (x == 0){
            // if the conditional is true, this block is executed
            x = 1;
        }
        else {
            // otherwise, this block is executed
            x = 2;
        }
        assertEquals("now x is ",___,x);
    
    }
}
