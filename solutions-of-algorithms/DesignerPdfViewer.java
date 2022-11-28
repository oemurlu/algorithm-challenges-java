public static int designerPdfViewer(List<Integer> h, String word) {
        int max = -1;
        for (int i = 0; i < word.length(); i++){
            int ascii = (int)word.charAt(i);
            int val = ascii - 97;
            if (h.get(val) > max) {
                max = h.get(val);
            }
        }
        return word.length() * max;
}