static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max_spent = -1;

        for(int keyboard_price: keyboards) {
            for (int drive_price: drives) {
                int total_price = keyboard_price + drive_price;
                if (total_price <= b && total_price > max_spent){
                    max_spent = total_price;
                }
            }
        }
        return max_spent;
}