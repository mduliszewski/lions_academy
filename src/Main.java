public class Main {

    public static void main(String[] args) {
        RequiredMethods methods = new RequiredMethods();

        System.out.println(methods.wordsCount(new String[]{"aa", "bb", "ccc", ""}, 2));

        String[] returnedWords = methods.wordsFront(new String[]{"a", "b", "c", "d"}, 1);

        for (String s: returnedWords){
            System.out.println(s);
        }

        System.out.println(methods.greenTicket(1,1,1));
        System.out.println(methods.greenTicket(1,1,2));
        System.out.println(methods.greenTicket(1,2,1));
        System.out.println(methods.greenTicket(2,1,3));
    }
}
