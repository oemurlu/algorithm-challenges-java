public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int bestScore = scores.get(0);
        int worstScore = bestScore;
        int bestRecord = 0;
        int worstRecord = 0;

        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
                bestRecord++;
            }
            else if (score < worstScore) {
                worstScore = score;
                worstRecord++;
            }
        }
        return List.of(bestRecord,worstRecord);
    }