public static int squares(int a, int b) {
        int firstNumber = (int) Math.ceil(Math.sqrt(a));
        int lastNumber = (int) Math.floor(Math.sqrt(b));
        int squareIntegers = (lastNumber - firstNumber) + 1;
        return squareIntegers;
        }