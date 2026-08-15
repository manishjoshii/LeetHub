class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int currFloor = 0;
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] != currFloor) {
                time += Math.abs(requests[i] - currFloor);
            }
            currFloor = requests[i];
        }
        return time;
    }
}