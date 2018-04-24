
package utils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Authors: Quenten Franc Jatkowski and Ashlan Elizabeth Olson
 * Date: 04/24/18
 * Overview: Class with 4 tests in order to check if program is correctly using a dynamic algorithm to return a list of coins used. 
 * One test throws an exception if the array is empty. The other 3 are used to show the correct coins are being chosen no matter the coins given.
 */
public class TestCoinsUtils {
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() throws IllegalArgumentException
    {
        CoinsUtils coins = new CoinsUtils();
        int array[] = {};
        coins.dpCoinChange(array,0);
    }
    @Test
    public void testSmallCoins() 
    {
        CoinsUtils coins = new CoinsUtils();
        int array[] = {1,5,10};
        assertArrayEquals(new int[] {1,5,10,10}, coins.dpCoinChange(array,26));  
    }
    
    @Test
    public void testFakeCoins()
    {
        CoinsUtils coins = new CoinsUtils();
        int array[] = {1,4,5,10,21};
        assertArrayEquals(new int [] {4,21,21}, coins.dpCoinChange(array,46));
    }
    
    @Test
    public void testManyCoins()
    {
        CoinsUtils coins = new CoinsUtils();
        int array[] = {1,5,10,25};
        assertArrayEquals(new int [] {1,1,5,10,25}, coins.dpCoinChange(array, 42));
    }
    

   
}
