
package utils;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Authors: Quenten Franc Jatkowski and Ashlan Elizabeth Olson
 * Date: 04/24/18
 * Overview: Creates change out of the least amount of coins from array given, using dynamic programming. Returns a list of the coins used.
 */
public class CoinsUtils 
{

	

	public int[] dpCoinChange(int coins[], int amount) 
        { 
		int numCoins[] = new int[amount + 1];
		int usedCoins[] = new int[amount + 1]; 
		numCoins[0] = 0;

		if (coins.length == 0) 
                { 
			throw new IllegalArgumentException("Array of size zero is not allowed");
		}
		for (int i = 1; i <= amount; i++)
                {
			numCoins[i] = Integer.MAX_VALUE;
		}

		for (int j = 1; j <= amount; j++)
                {
			for (int k = 0; k < coins.length; k++) 
                        { 
				if (coins[k] <= j && 1 + numCoins[j - coins[k]] < numCoins[j]) 
                                {
					numCoins[j] = 1 + numCoins[j - coins[k]];
					usedCoins[j] = coins[k]; 
				}
			}
		}
		ArrayList<Integer> givenChange = new ArrayList<Integer>();
		int k = amount;
		while(k >= 1) 
                {
			givenChange.add(usedCoins[k]);
			int temp = k;
			k = amount - usedCoins[k];
			amount = amount - usedCoins[temp];
		}
		coins = new int[givenChange.size()];
		for (int q= 0; q < givenChange.size(); q++) {
			coins[q] = givenChange.get(q);
                }
                
                System.out.println(Arrays.toString(coins));
                return coins;
	}


}

     

