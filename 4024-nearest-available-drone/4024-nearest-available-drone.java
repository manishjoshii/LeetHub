class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minDistance = Integer.MAX_VALUE;
        int answer = -1;
        for (int i = 0; i < drones.length; i++) {
            int range = drones[i][2];
            int distance = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            if (distance < minDistance && distance <= range) {
                minDistance = distance;
                answer = i;
            }

        }
        return answer;
    }
}