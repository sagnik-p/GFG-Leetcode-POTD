class Solution {
    String removeDups(String str) {
        ArrayList<Character> list = new ArrayList<Character>();
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(!contains(list,str.charAt(i)))
            {
                list.add(str.charAt(i));
            }
        }
        for(int i=0;i<list.size();i++)
        {
            ans+=list.get(i);
        }
        return ans;
    }
    boolean contains(ArrayList<Character> list,char ch)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==ch)
                return true;
        }
        return false;
    }
}