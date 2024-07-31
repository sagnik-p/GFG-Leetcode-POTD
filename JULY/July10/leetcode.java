class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack= new Stack<String>();
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("./"))
            {
                continue;
            }
            else if(logs[i].equals("../") && stack.size()!=0)
            {
                stack.pop();
            }
            else if(!logs[i].equals("./") &&!logs[i].equals("../"))
            {
                stack.push(logs[i]);
            }
        }
        return stack.size();
    }
}