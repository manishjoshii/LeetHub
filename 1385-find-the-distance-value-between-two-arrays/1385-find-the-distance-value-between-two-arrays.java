class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int a : arr1) {
            int j = lowerBound(arr2, a);

            if (j == 0) {
                if (arr2[0] - a > d) count++;
            } else if (j >= arr2.length) {
                if (a - arr2[arr2.length - 1] > d) count++;
            } else {
                if (arr2[j] - a > d && a - arr2[j - 1] > d) count++;
            }
        }
        return count;
    }

    private int lowerBound(int[] arr, int target){
        int low =0, high = arr.length;

        while(low<high){
            int mid = low+(high-low)/2;

            if(arr[mid]<target){
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}