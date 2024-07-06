class Solution {
    public int passThePillow(int n, int time)
    {
        boolean forward=true;
        int pos=1;
        for(int i=0;i<time;i++)
        {
            if(!forward&& pos==1)
                forward=true;
            if(forward && pos==n)
                forward=false;
            if(forward)
                pos++;
            else
                pos--;
        }
        return pos;
    }
}