public static long taumBday(int b, int w, int bc, int wc, int z) {
    long blackCost = Math.min(bc, wc + z);
    long whiteCost = Math.min(wc, bc + z);

    return (b * blackCost) + (w * whiteCost);
}