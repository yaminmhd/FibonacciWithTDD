import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    private int getFibonacciNumberAtPositionInSequence(int position){
        return new FibonacciGenerator().getNumberAtPosition(position);
    }

    @Test
    public void firstFibonacciNumberIsZero() throws Exception{
        assertEquals(0, getFibonacciNumberAtPositionInSequence(0));
    }

    @Test
    public void secondFibonacciNumberIsOne() throws Exception{
        assertEquals(1, getFibonacciNumberAtPositionInSequence(1));
    }

    @Test
    public void thirdFibonacciNumberIsOne() throws Exception{
        assertEquals(1, getFibonacciNumberAtPositionInSequence(2));
    }

    @Test
    public void fourthFibonacciNumberIsTwo() throws Exception{
        assertEquals(2, getFibonacciNumberAtPositionInSequence(3));
    }

    @Test
    public void sixthFibonacciNumberIsFive() throws Exception{
        assertEquals(5, getFibonacciNumberAtPositionInSequence(5));
    }


}