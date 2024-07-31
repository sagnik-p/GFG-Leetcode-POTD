class Solution
{
    public int[] nodesBetweenCriticalPoints(ListNode head)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        traverse(head.next, head.val, a, 1);
        int n=a.size();
        int[] arr = new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j] = a.get(j);
            System.out.println(arr[j]);
        }
        Arrays.sort(arr);
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(arr.length<=1)
            return ans;
        ans[1]=arr[n-1]-arr[0];
        int min=ans[1];
        for(int j=0;j<n-1;j++)
        {
            int temp= arr[j + 1] - arr[j];
            if (min >temp)
            {
                System.out.println("New min: "+temp+" from arr["+(j+1)+"]-arr["+j+"]");
                min =temp;
            }
        }
        System.out.println("final min:"+min);
        ans[0]=min;
        return ans;

    }
    public void traverse(ListNode current,int prev,ArrayList<Integer> a,int index)
    {
        if(current.next==null)
            return;




        if(current.val<prev && current.val<current.next.val)
            a.add(index);
        if(current.val>prev && current.val>current.next.val)
            a.add(index);
        traverse(current.next,current.val,a,index+1);
    }
}