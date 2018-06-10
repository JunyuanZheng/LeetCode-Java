import share.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null)
            queue.add(root);
        helper(result, queue, true);
        return result;
    }

    private void helper(List<List<Integer>> result, Queue<TreeNode> queue, boolean direction) {
        if (queue.size() == 0)
            return;
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i += 1) {
            TreeNode tmp = queue.poll();
            if (!direction)
                list.add(0, tmp.val);
            if (direction)
                list.add(tmp.val);
            if (tmp.left != null)
                queue.add(tmp.left);
            if (tmp.right != null)
                queue.add(tmp.right);

        }
        result.add(list);
        helper(result, queue, !direction);
    }
}
