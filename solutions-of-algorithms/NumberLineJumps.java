public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        for (int i = 0; i < 10000; i++) {
            if ((x1 + (v1 * i) == x2 + (v2 * i))) {
                result = "YES";
            }
        }
        return result;
    }