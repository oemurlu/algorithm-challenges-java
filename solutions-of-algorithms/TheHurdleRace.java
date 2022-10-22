public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int maxHurdleHeight = height.get(0);
        for (int hurdleHeight: height) {
            if (hurdleHeight > maxHurdleHeight) {
                maxHurdleHeight = hurdleHeight;
            }
        }
        if (k > maxHurdleHeight) {
            return 0;
        } else {
            return maxHurdleHeight - k;
        }
    }