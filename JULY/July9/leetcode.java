class Solution {
    public double averageWaitingTime(int[][] customers)
    {
        long[] wt=new long[customers.length];
        long current=1;
        for(int i=0;i<customers.length;i++)
        {
            //customers[i][0]=arrival time
            //customers[i][1]=waiting time
            if(current>=customers[i][0])
            {
                //idle,can prepare
                wt[i]=current+customers[i][1]-customers[i][0];
                current=current+customers[i][1];
            }
            else
            {
                i--;
                current++;
            }
        }
        double awt=0;
        for(int i=0;i<wt.length;i++)
        {
            awt+=wt[i];
        }
        awt=awt/customers.length;
        return awt;
    }
}