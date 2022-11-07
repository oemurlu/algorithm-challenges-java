public static List<Integer> permutationEquation(List<Integer> p) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] sequenceEquation = new int[p.size()];
        int y;

        for (int i = 1; i < p.size(); i++) {
            y = (p.indexOf(p.indexOf(i) + 1) + 1);
            list.add(y);
        }
        return list;
    }