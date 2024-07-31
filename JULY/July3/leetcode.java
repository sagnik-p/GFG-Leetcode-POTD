class Solution {
    public int minDifference(int[] nums)
    {
        if(nums.length<=4)
            return 0;
        nums= heapSort(nums,nums.length);
        return Math.min(Math.min(nums[nums.length-1]-nums[3],nums[nums.length-2]-nums[2]),Math.min(nums[nums.length-3]-nums[1],nums[nums.length-4]-nums[0]));
    }
    public void swap(int[] array, int x, int y)
    {
        int temp;
        temp =array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    public void maxHeapify(int[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;
        // If right child is larger than root
        if (right < n && arr[right] > arr[largest])
            largest = right;
        // If root is not largest
        if (largest != i) {
            // swap a[i] with a[largest]
            swap(arr,i,largest);

            maxHeapify(arr, n, largest);
        }
    }
    public void buildMaxHeap(int[] arr, int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
    }
    public int[] heapSort(int[] arr, int n) {
        buildMaxHeap(arr,n);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);
            maxHeapify(arr, i, 0);
        }

        return arr;
    }
}