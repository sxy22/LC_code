package offer;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

/**
 * @author Sicheng HE
 * @create 2021-02-25
 */
public class Offer_36 {
}

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

class Solution {
    ArrayList<Node> sorted_lst = new ArrayList<>();

    public Node treeToDoublyList(Node root) {
        this.midorder(root);
        if (sorted_lst.size() == 0) return null;

        for (int i = 0; i < sorted_lst.size(); i++) {
            // left
            if (i == 0) {
                sorted_lst.get(i).left = sorted_lst.get(sorted_lst.size() - 1);
            }else {
                sorted_lst.get(i).left = sorted_lst.get(i - 1);
            }
            // right
            if (i == sorted_lst.size() - 1) {
                sorted_lst.get(i).right = sorted_lst.get(0);
            }else {
                sorted_lst.get(i).right = sorted_lst.get(i + 1);
            }
        }

        return sorted_lst.get(0);
    }

    void midorder(Node root) {
        if (root == null) return;
        midorder(root.left);
        sorted_lst.add(root);
        midorder(root.right);
    }
}