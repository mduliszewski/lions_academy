public class RequiredMethods {

    /**
     * Counts the number of strings in a string array of a given length
     *
     * @param words String[] Array containing Strings
     * @param len int The length of strings that will be counted
     * @return int
     */
    public int wordsCount(String[] words, int len) {
        int nrOfStringsOfGivenLength = 0;
        for (String word: words){
            if (word.length() == len){
                nrOfStringsOfGivenLength++;
            }
        }
        return nrOfStringsOfGivenLength;
    }

    /**
     * For a given array of strings, returns new array with the first N strings (N is in range 1..length)
     *
     * @param words String[] Array containing strings
     * @param n int The number of first strings in new array
     * @return String[]
     */
    public String[] wordsFront(String[] words, int n){
        String[] chosenWords = new String[n];
        for (int i = 0; i<n; i++){
            chosenWords[i] = words[i];
        }
        return chosenWords;
    }

    /**
     * This method takes 3 numbers as arguments. If all 3 are the same it returns 20 and
     * if 2 are the same it returns 10 else it returns 0
     *
     * @param a int first number
     * @param b int second number
     * @param c int third number
     * @return int
     */
    public int greenTicket(int a, int b, int c) {

        if (a==b && b==c){
            return 20;
        }
        if (a!=b && b!=c && a!=c){
            return 0;
        }
        return 10;
    }
}
