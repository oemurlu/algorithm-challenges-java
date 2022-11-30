public static int pageCount(int n, int p) {
        // n: the number of pages in the book
        // p: the page number to turn to
        int flipFromStart = p/2;
        int flipFromEnd = (n/2) - (p/2);
        return Math.min(flipFromStart, flipFromEnd);
    }