public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCount = 0;
        int orangeCount = 0;

        for (Integer apple: apples) {
            if ((a + apple) >= s && (a + apple) <= t) {
                appleCount++;
            }
        }
        for (Integer orange: oranges) {
            if ((b + orange) >= s && (b + orange) <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount + "\n" + orangeCount);
    }