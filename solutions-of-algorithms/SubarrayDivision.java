public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < m + i; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d)
                count++;
        }
        return count;

    }