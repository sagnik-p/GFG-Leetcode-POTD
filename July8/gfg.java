class Solution {
    int search(int[] arr, int key)
    {
        return find(arr,key,0);
    }
    public int find(int[] arr,int key,int index)
    {
        if(index>=arr.length)
            return -1;
        if(arr[index]==key)
            return index;
        else
            return find(arr,key,index+1);
    }
}