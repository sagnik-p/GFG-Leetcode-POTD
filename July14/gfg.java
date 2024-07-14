class Solution {
    void segregate0and1(int[] arr)
    {
        int f0=0,f1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                f0++;
            else
                f1++;
        }
        for(int i=0;i<f0;i++)
            arr[i]=0;
        for(int i=f0;i<arr.length;i++)
            arr[i]=1;
    }
}
