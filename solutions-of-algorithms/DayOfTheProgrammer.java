public static String dayOfProgrammer(int year) {
        if(year > 1918) {
            return gregorianCalender(year);
        } else if(year <=1917) {
            return julianCalender(year);
        } else {
            return "26.09." + year;
        }
}

public static String gregorianCalender(int year) {
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
}

public static String julianCalender(int year) {
        if(year%4 == 0) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
}