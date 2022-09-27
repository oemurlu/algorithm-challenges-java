public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int a = 0; //left to right
        int b = 0; // right to left

        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).size(); j++){
                if (i == j){
                    a += arr.get(i).get(j);
                }
                if ((i + j) == arr.get(i).size() - 1){
                    b += arr.get(i).get(j);
                }
            }
        }
        if (a > b){
            return a - b;
        }
        if (a < b){
            return b - a;
        }
        else return 0;
}