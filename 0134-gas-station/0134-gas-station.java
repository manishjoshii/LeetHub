class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();
        if (totalGas < totalCost) {
            return -1;
        }

        int result_index = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                result_index = i + 1;
                total = 0;
            }
        }
        return result_index;
    }
    // public int canCompleteCircuit(int[] gas, int[] cost) {
    //     int n = gas.length;

    //     for (int i = 0; i < n; i++) {
    //         if (gas[i] < cost[i])
    //             continue;

    //         int j = (i + 1) % n;

    //         int costForMovingFromThisStation = cost[i];
    //         int gasEarnInNextStation = gas[j];
    //         int currGas = gas[i] - costForMovingFromThisStation + gasEarnInNextStation;

    //         while (j != i) {
    //             if (currGas < cost[j]) {
    //                 break;
    //             }
    //             int costForMovingFromThisJ = cost[j];
    //             j = (j + 1) % n;
    //             int gasEarnInNextStationJ = gas[j];
    //             currGas = currGas - costForMovingFromThisJ + gasEarnInNextStationJ;
    //         }
    //         if (j == i) return i;
    //     }
    //     return -1;
    // }
}