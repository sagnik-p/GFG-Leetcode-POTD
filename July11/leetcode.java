class Solution
{
    public String reverseParentheses(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                String temp="";
                char x=stack.pop();
                //pop until you get (
                while(x!='(')
                {
                    temp=x+temp;//reversing here
                    System.out.println("temp= "+temp);
                    x=stack.pop();

                }
                //System.out.println("Current stack:");
                //System.out.println(stack.toString().replaceAll("\\[", "").replaceAll("]", ""));
                //System.out.println("Final Temp "+temp);
                for(int j=0;j<temp.length();j++)
                {
                    stack.push(temp.charAt(temp.length()-1-j));
                }
            }
        }
        //System.out.println(stack.toString().replaceAll("\\[", "").replaceAll("]", ""));
        String ans="";
        while(!stack.empty())
        {
            char y=stack.pop();
            //System.out.println(y);
            ans=y+ans;
        }
        return ans;
    }
}