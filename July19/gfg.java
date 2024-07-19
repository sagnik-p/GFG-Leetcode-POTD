class Solution {

    private static int merge(int[] arr, int[] indices, int low, int mid, int high, int[] count) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[indices[left]] <= arr[indices[right]]) {
                temp.add(indices[left]);
                count[indices[left]] += cnt;
                left++;
            } else {
                temp.add(indices[right]);
                cnt++;
                right++;
            }
        }
        while (left <= mid) {
            temp.add(indices[left]);
            count[indices[left]] += cnt;
            left++;
        }
        while (right <= high) {
            temp.add(indices[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            indices[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static void mergeSort(int[] arr, int[] indices, int low, int high, int[] count) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, indices, low, mid, count);
        mergeSort(arr, indices, mid + 1, high, count);
        merge(arr, indices, low, mid, high, count);
    }

    public static int[] countSmallerElements(int[] arr) {
        int n = arr.length;
        int[] indices = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        mergeSort(arr, indices, 0, n - 1, count);
        return count;
    }

    public int[] constructLowerArray(int[] arr) {
        return countSmallerElements(arr);
    }
}