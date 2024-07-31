class Solution {
    // Function to find the vertical width of a Binary Tree.
    int lmax=0,rmax=0;
    public int verticalWidth(Node root)
    {
        if(root==null)
            return 0;
        traverse(root,0);
        return lmax+rmax+1;
    }
    public void traverse(Node root,int cursor)
    {
        if(cursor<0) // left subtree
            lmax=Math.max(lmax,-cursor);
        else 
            rmax=Math.max(rmax,cursor);
        if(root.left!=null)
            traverse(root.left,cursor-1);
        if(root.right!=null)
            traverse(root.right,cursor+1);
    }
}