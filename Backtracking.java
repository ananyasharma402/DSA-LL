class Backtracking {

    public static void printPermutation(String str, String perm, int idx) {

        // Base case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // Store current character
            char currChar = str.charAt(i);

            // Remove current character from string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            printPermutation(newStr, perm + currChar, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
