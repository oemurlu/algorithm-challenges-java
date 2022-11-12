import java.util.List;

class Result {

    static int getGCD(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return getGCD(n2, n1 % n2);
    }
    static int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        else {
            int gcd = getGCD(n1, n2);
            return Math.abs(((n1 * n2) / gcd));
        }
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;

        int lcm = a.get(0);
        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }

        int gcd = b.get(0);
        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;
            if (gcd % multiple == 0)
                result++;
        }
        return result;
    }
    //yari anladim yardimla yaptim
}