public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = candles.get(0);
        for (int i = 1; i < candles.size(); i++){
            if (candles.get(i) > max) {
                max = candles.get(i);
            }
        }
        int count = 0;
        for (int j = 0; j < candles.size(); j++) {
            if (candles.get(j) == max) {
                count +=1;
            }
        }
        return count;
    }