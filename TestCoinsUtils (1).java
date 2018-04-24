/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *  Authors: Quenten Franc Jatkowski and Ashlan Elizabeth Olson
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
