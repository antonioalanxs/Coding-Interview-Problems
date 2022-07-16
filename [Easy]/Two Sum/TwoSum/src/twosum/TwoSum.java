package twosum;

import java.util.Arrays;

/**
 * This problem was recently asked by Google.
 * 
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k. For example, given [10, 15, 3, 7] and k of 17, return
 * true since 10 + 7 is 17.
 * 
 * Bonus: Can you do this in one pass?
 *
 * @author antonioalanxs
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] a = {10, 15, 3, 7};
        int k = 17;
        System.out.println(Arrays.toString(a));
        boolean flag = new Solution().twoSum(a, k);
        if (!flag) {
            System.out.println("There are no two numbers in the list that add up to " + k + ".");
        } else {
            System.out.println("There are two numbers in the list that add up to " + k + ".");
        }
    }

}
