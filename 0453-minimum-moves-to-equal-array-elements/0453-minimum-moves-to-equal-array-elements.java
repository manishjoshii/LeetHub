// find difference of each elemnet from min element for e.g.    input= [1,2,3]
// min = 1,   nums[0]-min = 1-1=0,     nums[1]-min = 2-1 =1;     nums[2]-min = 3-1 = 2;
// so now add all dif to find main answer = 0+1+2 = 3
// we can also make it as = (nums[0]-min) + (nums[1]-min)+.....+ (nums[n-1]-min);
// thererfore,    (nums[0]+nums[1]+....nums[n-1]) - nums.length*min;
// sum - nums.length*min; 
class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min_el = Integer.MAX_VALUE;

        for (int n : nums) {
            sum += n;
            min_el = Math.min(min_el, n);
        }

        return sum - nums.length * min_el;
    }
}