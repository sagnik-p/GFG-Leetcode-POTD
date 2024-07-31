class Solution
{
    Node prev;
    public void populateNext(Node root)
    {
        inorder(root);
    }
    public void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        if(prev!=null)
            prev.next=root;
        prev=root;
        inorder(root.right);
    }
}