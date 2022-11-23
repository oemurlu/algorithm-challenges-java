public static int minimumDistances(List<Integer> a) {

        int min=Integer.MAX_VALUE;

        for(int i=0;i<a.size();i++) {
            int firstindex=a.indexOf(a.get(i));
            int lastindex=a.lastIndexOf(a.get(i));
            int diff=lastindex-firstindex;
            if(diff!=0)min=Math.min(min, diff);
        }

        if(min!=Integer.MAX_VALUE)return min;
        else return -1;
    }