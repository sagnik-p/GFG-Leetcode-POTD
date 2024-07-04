class Solution {
    public List<Node> printAllDups(Node root)
    {
        List<Node> res = new ArrayList<Node>();
        Map<String,Integer> table= new HashMap<String,Integer>();
        stringify(root,table,res);
        return res;
    }
    public String stringify(Node root,Map<String,Integer> table,List<Node> res)
    {
        // put entry in hashmap
        // if already exists, increment count;
        if(root==null)
            return "NULL";
        String str = root.data + ","+stringify(root.left,table,res) + stringify(root.right,table,res);
        table.put(str,table.getOrDefault(str,0)+1);

        if(table.get(str) == 2)
            res.add(root);
        return str;
    }
}