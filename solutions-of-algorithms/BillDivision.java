public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int totalPrice = 0;

        for (int item: bill) {
            totalPrice += item;
        }
        int bActual = totalPrice - bill.get(k);
        if (bActual/2 == b){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - bActual/2);
        }
    }