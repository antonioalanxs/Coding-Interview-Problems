package singlenumberii;

import java.util.Arrays;

/**
 * This problem was asked by Google. 
 * 
 * Given an array of integers where every integer occurs three times except for
 * one integer, which only occurs once, find and return the non-duplicated 
 * integer. 
 * 
 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13],
 * return 19. 
 * 
 * Do this in O(N) time and O(1) space.
 *
 * @author antonioalanxs
 */
public class SingleNumberII {

    public static void main(String[] args) {
        int[] a = {6, 1, 3, 3, 3, 6, 6};
        System.out.println(Arrays.toString(a));
        int result = new Solution().singleNumber(a);
        if (result == -1) { // Error code.
            System.out.println("There is no single number...");
        } else {
            System.out.println("Single number: " + result + ".");
        }
    }
    
}
