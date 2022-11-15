public static int sockMerchant(int n, List<Integer> ar) {

        /**
        * f is the frequency array
        * i is the control variable of for loops
        * c stores the total number of pairs
        */

        int f[]=new int[101],i;
        int c=0;

        //filling up the frequency array
        for(i = 0; i < n; i++)
            f[ar.get(i)]++;

        //counting the total number of pairs
        for(i=1;i<=100;i++)
            c+=f[i]/2;

        return c;
    }