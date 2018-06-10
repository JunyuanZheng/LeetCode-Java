import share.TreeNode;

public class Question108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode result = new TreeNode(nums[mid]);
        result.left = helper(nums, start, mid - 1);
        result.right = helper(nums, mid + 1, end);
        return result;
    }
}
