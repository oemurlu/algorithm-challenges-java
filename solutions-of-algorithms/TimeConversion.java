public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
        if (s.endsWith("PM")) {
            hour += 12;
        }
        return String.format("%02d", hour) + s.substring(2,8);
    }