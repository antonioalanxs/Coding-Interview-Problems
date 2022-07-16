package singlenumberii;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author antonioalanxs
 */
public class Solution {

    public int singleNumber(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        int aux = 0; // It will be useful to know the last number deleted.
        for (int i : a) {
            if (hs.contains(i)) {
                hs.remove(i);
                aux = i;
            }
            if (aux != i) {
                hs.add(i);
            }
        }

        if (hs.isEmpty()) { // There is no number that is not repeated. 
            return -1;
        }
        return new ArrayList<>(hs).get(0); // We convert the set to a list to
                                           // access its number.
    }

}
