public static int jumpingOnClouds(List<Integer> c) {
        int numberOfJumps = 0;
        int i = 0;

        while (i < c.size() - 1) {
            if (i + 2 == c.size() || c.get(i + 2) == 1) {
                i++;
                numberOfJumps++;
            } else {
                i += 2;
                numberOfJumps++;
            }
        }
        return numberOfJumps;
    }