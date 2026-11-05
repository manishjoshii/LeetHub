class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int a : arr1) {
            int j = lowerBound(arr2, a);

            if (j == 0) { // all elemtns greater than of equla to 'a'
                if (arr2[0] - a > d) count++;
            } else if (j >= arr2.length) { //  // all elemtns less than of equla to 'a'
                if (a - arr2[arr2.length - 1] > d) count++;
            } else {
                if (arr2[j] - a > d && a - arr2[j - 1] > d) count++;
            }
        }
        return count;
    }

    private int lowerBound(int[] arr, int target){
        int low =0, high = arr.length;
        //apply binary search to find index of element just greater than target element , i.e. lowerbound
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