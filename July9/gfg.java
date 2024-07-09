class Solution
{
    static int threeSumClosest(int[] array, int target)
    {
        Arrays.sort(array);
        int p1,p2,p3;
        int minabsdiff=Integer.MAX_VALUE;
        int closestsum=0;
        //now array is sorted
        for(int i=0;i<array.length-2;i++)
        {
            p1=i;
            // p1 is fixed
            //System.out.println("Currently checking for i="+i);
            p2=i+1;
            p3= array.length-1;
            // change p1  and p2 to get closest sum to target;
            //System.out.println("Pointers are: "+p1+" "+p2+" "+p3);
            while(p2<p3)
            {
                int sum=array[p1]+array[p2]+array[p3];
                //System.out.println("Pointers are: "+p1+" "+p2+" "+p3+" sum is: "+sum);

                if(Math.abs(target-sum)<minabsdiff)
                {
                    closestsum=sum;
                    minabsdiff = Math.abs(target-sum);
                }
                if(Math.abs(target-sum)==minabsdiff)
                {
                    closestsum=Math.max(closestsum,sum);
                }
                if(sum<target)
                    p2++;
                else if(sum>target)
                    p3--;
                else
                    return target;
            }

        }
        return closestsum;

    }
}