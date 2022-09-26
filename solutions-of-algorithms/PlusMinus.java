public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float p = 0;
        float n = 0;
        float z = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                p += 1;
            } else if (arr.get(i) < 0) {
                n += 1;
            } else if (arr.get(i) == 0) {
                z += 1;
            }
        }
        p = p / arr.size();
        n = n / arr.size();
        z = z / arr.size();
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }