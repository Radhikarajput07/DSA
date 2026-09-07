class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        double[][] cars = new double[n][2];

        // [position, time]
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Position ko descending order mein sort karo
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double slowestTime = 0;

        for (int i = 0; i < n; i++) {

            if (cars[i][1] > slowestTime) {
                fleets++;
                slowestTime = cars[i][1];
            }
        }

        return fleets;
    }
}