public static int migratoryBirds(List<Integer> arr) {
        int[] idArray = new int[5];
        int max = idArray[0];
        int index = 0;

        for (int element: arr) {
            switch (element) {
                case 1:
                    idArray[0]++;
                    break;
                case 2:
                    idArray[1]++;
                    break;
                case 3:
                    idArray[2]++;
                    break;
                case 4:
                    idArray[3]++;
                    break;
                case 5:
                    idArray[4]++;
                    break;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (idArray[i] > max) {
                max = idArray[i];
                index = i + 1;
            }
        }
    return index;
    }