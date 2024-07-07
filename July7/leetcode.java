class Solution
{
    public int numWaterBottles(int numBottles, int numExchange)

    {
        int s=0;
        int full=numBottles;
        int empty=0;
        while(full!=0)
        {
            s+=full;
            //now empty;
            empty+=full;

            full=0;
            int d = empty/numExchange;
            if(d!=0)
            {
                System.out.println("drink="+s);
                System.out.println(d);
                full+=d;
                empty=empty-numExchange*d;
            }
            else
            {
                break;
            }
        }
        return s;
    }
}