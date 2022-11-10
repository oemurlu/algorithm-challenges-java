public static int equalizeArray(List<Integer> arr) {
        int upperLimit = 100;
        int[] intArray = new int[100];
        int maxCount = 0;
        int lengthOfList = arr.size();

        for (int element : arr) {
            intArray[element - 1] += 1;
        }
        for (int i = 0; i < upperLimit; i++) {
            if (intArray[i] > maxCount)
                maxCount = intArray[i];
        }
        return lengthOfList - maxCount;
    }

