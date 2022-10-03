public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = arr.get(0);
        long max = 0;
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            sum += arr.get(i);
        }
        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.printf("%d %d", minSum, maxSum);
    }
}