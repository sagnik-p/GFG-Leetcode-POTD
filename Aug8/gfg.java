class Solution {
    boolean isSumTree(Node root) {
	    if(root==null)return true;
	    if(root.left==null && root.right==null)return true;
	    boolean left=isSumTree(root.left);
	    boolean right=isSumTree(root.right);
	    if(!left||!right)return false;
	    int leftSum=0;
	    int rightSum=0;
	    if(root.left!=null)leftSum=root.left.data;
	    if(root.right!=null)rightSum=root.right.data;
	    boolean ans= (root.data==(leftSum+rightSum))?true:false;
	    root.data=leftSum+rightSum+root.data;
	    return ans;
    }
}