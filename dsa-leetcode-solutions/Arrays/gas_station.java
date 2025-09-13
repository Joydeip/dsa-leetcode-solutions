// leetcode 134, Gas Station

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tank = 0;
        int tolgas = 0;
        int tolcost = 0;
        for (int i = 0; i < cost.length; i++) {
            tolgas += gas[i];
            tolcost += cost[i];

            tank = tank + (gas[i] - cost[i]);
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if(tolgas<tolcost){
            return -1;
        }

        return start;
    }
}