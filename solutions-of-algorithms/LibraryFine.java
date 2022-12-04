    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        if (y1 > y2) {
            return 10000;
        }

        else if (m1 > m2 && y1 == y2) {
            return 500 * (m1 - m2);
        }

        else if (d1 > d2 && m1 == m2 && y1 == y2 ) {
            return 15 * (d1 - d2);
        }

        else {
            return 0;
        }
    }