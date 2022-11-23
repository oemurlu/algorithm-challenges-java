public static String angryProfessor(int k, List<Integer> a) {
        int early = 0;
        for (int time: a) {
            if (time <= 0) {
                early++;
            }
        }
        if (k <= early) {
            return "NO";
        } else {
            return "YES";
        }
    }