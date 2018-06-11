public class Question134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int size = gas.length;
        for (int idx = 0; idx < size;) {
            int distance;
            int sum = gas[idx] - cost[idx];
            for (distance = 1; distance <= size; distance += 1) {
                if (sum < 0) {
                    idx = idx + distance != idx ? idx + distance : idx + distance + 1;
                    break;
                }
                sum = sum + gas[(idx + distance) % size] - cost[(idx + distance) % size];
            }
            if (distance == size + 1)
                return idx;
        }
        return -1;
    }
}
