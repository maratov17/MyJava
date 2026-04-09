package day3_string_manipulation;

public class Practice {
    public static void main(String[] args) {
        String sentence="Hello guys how was your day?";
        boolean containsWas=sentence.contains("was");
        System.out.println(containsWas);

        int lengthOfSentence=sentence.length();
        System.out.println(lengthOfSentence);

        String userValue="";
        int lenghtOfUserValue=userValue.length();
        System.out.println(lenghtOfUserValue);

        boolean isEmpty=userValue.isEmpty();
        System.out.println(isEmpty);
    }
}
