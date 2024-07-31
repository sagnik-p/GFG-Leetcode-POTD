class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // Your code start
                int size = arr.size();
        if (size == 1) return arr.get(0);

        long mod = 1000000007;
        boolean z = false;
        long mProd = 1;
        long a = Long.MIN_VALUE;

        for (int i = 0; i < size; ++i) {
            int num = arr.get(i);
            if (num == 0) {
                z = true;
            } else if (num > 0) {
                mProd = (mProd * num) % mod;
            } else {
                mProd = (mProd * num) % mod;
                a = Math.max(a, (long) num);
            }
        }

        if (mProd < 0) {
            mProd = mProd / a;
        }

        if (mProd == 1 && z) {
            return 0;
        }

        return mProd;
        //Your code end
    }
}