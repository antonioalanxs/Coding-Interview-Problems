package twosum;

import java.util.HashSet;

/**
 *
 * @author antonioalanxs
 */
public class Solution {

    public boolean twoSum(int[] a, int k) {
        boolean flag = false;
        int index = 0;
        int length = a.length;
        HashSet<Integer> hs = new HashSet<>();
        while (!flag && index < length) {
            flag = hs.contains(a[index]);
            if (!flag) {
                hs.add(k - a[index]);
                index++;
            }
        }
        return flag;
    }
    
}
