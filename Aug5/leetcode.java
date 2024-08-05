class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> table = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
            table.put(arr[i], table.getOrDefault(arr[i],1)+1);
        System.out.println(table);
        for(String i:arr)
        {
            if(table.get(i)==2)
            {
                if(k==1)
                    return i;
                else
                    k--;
            }
            else
                continue;
        }
        return "";
    }
}