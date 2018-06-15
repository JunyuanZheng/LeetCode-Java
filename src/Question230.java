import share.TreeNode;

public class Question230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;
        int left = countNodes(root.left);
        if (k <= left)
            return kthSmallest(root.left, k);
        else if (k == left + 1)
            return root.val;
        else
            return kthSmallest(root.right, k - left - 1);
    }

    private int countNodes(TreeNode n) {
        if (n == null) return 0;
        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}
