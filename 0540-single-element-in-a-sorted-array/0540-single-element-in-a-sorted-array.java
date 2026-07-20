class Solution {
    // public int singleNonDuplicate(int[] nums) {
    //     int i = 0, res = 0;
    //     while (i < nums.length) {
    //         if (i != nums.length - 1 && nums[i] == nums[i + 1]) {
    //             i = i + 2;
    //         } else {
    //             res = nums[i];
    //             break;
    //         }
    //     }
    //     return res;
    // }
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;
            boolean isEven = (h - mid) % 2 == 0 ? true : false;

            if (nums[mid] == nums[mid + 1]) {
                if (isEven) {
                    l = mid + 2;
                } else {
                    h = mid - 1;
                }
            } else {
                if (isEven) {
                    h = mid;
                } else {
                    l = mid + 1;
                }
            }

        }

        return nums[h];
    }
}