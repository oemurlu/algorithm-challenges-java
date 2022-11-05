public static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);
    }