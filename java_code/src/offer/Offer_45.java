package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sicheng HE
 * @create 2021-02-26
 */
public class Offer_45 {
}


class Solution {
    public String minNumber(int[] nums) {
        List<number> lst = new ArrayList<>();
        // 定义比较器
        Comparator<number> comp = new Comparator<>() {
            @Override
            public int compare(number o1, number o2) {
                String a = String.valueOf(o1.val) + String.valueOf(o2.val);
                String b = String.valueOf(o2.val) + String.valueOf(o1.val);
                if (a.compareTo(b) <= 0) return -1;
                return 1;
            }
        };

        for (int num : nums) {
            lst.add(new number(num));
        }

        Collections.sort(lst, comp);
        StringBuffer str = new StringBuffer();
        for (number n : lst) {
            str.append(String.valueOf(n.val));
        }

        return str.toString();
    }
}

class number {
    int val;

    public number(int val) {
        this.val = val;
    }
}