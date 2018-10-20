public class RequiredMethods {

    /**
     * Counts the number of strings in a string array of a given length
     *
     * @param words String[] Array containing Strings
     * @param len int The length of strings that will be counted
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
}
