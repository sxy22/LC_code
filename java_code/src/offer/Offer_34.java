package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sicheng HE
 * @create 2021-02-25
 */
public class Offer_34 {

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return ans;

    }

    void dfs(TreeNode root, int resi) {
        if (root == null) return;
        path.add(root.val);
        resi -= root.val;
        if (root.left == null && root.right == null && 0 == resi) {
            ans.add(new LinkedList<>(path));
        }

        dfs(root.left, resi);
        dfs(root.right, resi);
        path.removeLast();
    }
}
