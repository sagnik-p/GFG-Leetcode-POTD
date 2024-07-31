class Solution {
    /*you are required to complete this function */
   boolean hasPathSum(Node root, int target)
    {
        if(root==null)
            return false;
        if(root.left==null && root.right==null) 
        {
            if (root.data == target)
                return true;
        }
        return hasPathSum(root.left, target - root.data) || hasPathSum(root.right,target-root.data);
    }
}