public static int findDigits(int n) {
        // Write your code here
        int count = 0;
        int temp = n;

        while (temp > 0) {
            int lastIndex = temp % 10;
            if (lastIndex != 0 && n % lastIndex == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }