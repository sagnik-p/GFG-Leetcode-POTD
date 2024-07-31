class Solution {
    public boolean compute(Node root) 
    {
        String s="";
        while(root!=null)
        {
            s+=root.data;
            root=root.next;
        }
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}