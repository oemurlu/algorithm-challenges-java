public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++){
        if (a.get(i) > b.get(i)) aliceScore += 1;
        if (a.get(i) < b.get(i)) bobScore += 1;
        }
        answer.add(0,aliceScore);
        answer.add(1,bobScore);
        return answer;
        }