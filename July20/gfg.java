class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        if (root == null) {
            return null;
        }

        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);

        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left == null) {
            Node newRoot = root.right;
            return newRoot;
        }

        if (root.right == null) {
            Node newRoot = root.left;
            return newRoot;
        }

        return root;
    }
}