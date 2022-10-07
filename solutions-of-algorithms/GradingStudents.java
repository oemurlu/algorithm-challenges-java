public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int[] arr = new int[grades.size()];
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade < 38) {
                grades.set(i,grade);
            } else {
                int f1 = grade + 1;
                int f2 = grade + 2;
                if (f1 % 5 == 0) {
                    grades.set(i,f1);
                } else if (f2 % 5 == 0) {
                    grades.set(i,f2);
                }
            }
        }
        return grades;
    }