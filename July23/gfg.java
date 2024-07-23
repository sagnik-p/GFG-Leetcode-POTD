class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    List<Integer> lis;
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        lis= new ArrayList<>();

        dfs( root1);
        dfs( root2);

        Collections.sort( lis);
        return  lis;
    }

    public void dfs( Node root){
        if( root==null) return;

        lis.add(root.data );
        dfs(root.left);
        dfs(root.right);
    }
}