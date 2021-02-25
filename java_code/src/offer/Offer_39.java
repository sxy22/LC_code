package offer;

import java.util.HashMap;

/**
 * @author Sicheng HE
 * @create 2021-02-25
 */
public class Offer_39 {
}
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            }else {
                map.put(num, count + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }
}