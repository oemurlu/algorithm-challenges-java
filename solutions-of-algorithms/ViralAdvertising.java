public static int viralAdvertising(int n) {
        // Write your code here
        int received = 5;
        int sum = 0;
        while (n-- > 0) {
            int remaining = received/2;
            sum += remaining;
            received = remaining * 3;
        }
        return sum;
    }