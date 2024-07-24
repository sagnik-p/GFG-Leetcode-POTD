
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    class Pair{
        boolean isbst;
        int min;
        int max;
        Pair(boolean isbst,int min,int max){
            this.isbst=isbst;
            this.min=min;
            this.max=max;
        }
    }
    
    Pair check(Node root){
        if(root==null)return new Pair(true,Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        Pair left=check(root.left);
        Pair right=check(root.right);
        
        boolean istrue=left.isbst&&right.isbst&&root.data>left.max&&root.data<right.min;
        
        int min=Math.min(root.data,left.min);
        int max=Math.max(root.data,right.max);
        
        if(!istrue)return new Pair(false,0,0);
        
        return new Pair(true,min,max);
    }
    boolean isBST(Node root) {
        // code here.
        return check(root).isbst;
    }
}