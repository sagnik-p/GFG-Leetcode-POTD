class Solution
{

    public ArrayList<Integer> Ancestors(Node root, int target)
    {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        boolean exists=traverse(root, arr,target);
        if(!exists)
        {
            System.out.println("DNE");
            return new ArrayList<Integer>();
        }
        else
        {
            return arr;
        }
    }
    public boolean traverse(Node node,ArrayList<Integer> arr,int target)
    {
        if(node==null)
        {
            return false;
        }
        if(node.data==target)
        {
            return true;
        }
        boolean l=traverse(node.left,arr,target);
        boolean r=traverse(node.right,arr,target);
        if(l || r)
        {
            arr.add(node.data);
        }
        return l || r;
    }
}