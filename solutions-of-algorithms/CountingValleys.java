public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valleyCount = 0;
        String[] s = path.split("");

        for (int i = 0; i < steps; i++) {
            if (s[i] == "U") {
                altitude++;
                if (altitude == -1) {
                    valleyCount++;
                }
                else {
                    altitude--;
                }
            }
        }
        return valleyCount;
    }