package offer;

import java.util.Arrays;

/**
 * @author Sicheng HE
 * @create 2021-02-26
 */
public class Offer_40 {
}
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }
}