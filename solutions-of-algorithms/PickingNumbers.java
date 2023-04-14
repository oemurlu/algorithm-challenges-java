public static int pickingNumbers(List<Integer> a){
        Collections.sort(a);
        int max=1;
        int base=a.get(0)+1;
        int count=1;
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=base){
            count++;
        } else {
            base=a.get(i)+1;
            max=Math.max(max,count);
            count=1;
            }
        }

        return Math.max(max,count);
}