public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        while (i <= j) {
            if ((i - reverse(i)) % k == 0) {
                beautifulDays++;
            }
            i++;
        }
        return beautifulDays;
    }

    static int reverse(int n) {
        int result = 0;
        while (n > 0) {
            result = result * 10 + ( n % 10);
            n /= 10;
        }
        return result;
    }
}