public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = arr.get(0);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            sum += arr.get(i);
        }
        int minSum = sum - max;
        int maxSum = sum - min;

        System.out.printf("%d %d", minSum, maxSum);
    }
}