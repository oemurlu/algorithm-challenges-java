public static long repeatedString(String s, long n) {
        long total_full_strings = n / s.length();
        long remainder = n % s.length();
        char[] c = s.toCharArray();
        long count = 0;

        for (int i=0; i < s.length(); i++) {
            if (c[i] == 'a') count++;
        }
        count *= total_full_strings;
        for (int i=0; i < remainder; i++) {
            if (c[i] == 'a') count++;
        }
        return count;
        }