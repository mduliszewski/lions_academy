public class Main {

    public static void main(String[] args) {
        RequiredMethods methods = new RequiredMethods();

        System.out.println(methods.wordsCount(new String[]{"aa", "bb", "ccc", ""}, 2));

        String[] returnedWords = methods.wordsFront(new String[]{"a", "b", "c", "d"}, 1);

        for (String s: returnedWords){
            System.out.println(s);
        }
    }
}
