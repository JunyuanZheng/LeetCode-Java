import share.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null)
            return lists;
        queue.add(root);
        while (queue.size() != 0) {
            ArrayDeque<TreeNode> tmp = new ArrayDeque<>();
            List<Integer> result = new ArrayList<>();
            while (queue.size() != 0) {
                TreeNode node = queue.remove();
                result.add(node.val);
                if (node.left != null)
                    tmp.add(node.left);
                if (node.right != null)
                    tmp.add(node.right);
            }
            lists.add(result);
            queue = tmp;
        }

        return lists;
    }
}
