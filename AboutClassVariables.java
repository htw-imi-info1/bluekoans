import static org.junit.Assert.*;
import org.junit.Test;
import static koan.Constants.*;
import java.util.*;
/**
 * Write a description of class AboutClassVariables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AboutClassVariables
{
  
    @Test
    public void aboutAccessingClassVariables(){
    Ball ball = new Ball();
    Ball.gravity = 7;
    assertEquals("the class variable can be accessed via the class",7,Ball.gravity);
    // and also via an instance, but that is not recommended
    ball.gravity = 5;
    assertEquals("anyway, it has changed",5,Ball.gravity);
    
    }
}
