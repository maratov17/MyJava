package day4_string_manipulation2;

public class Main {
    public static void main(String[] args) {
        String name="Aiza";
        String name2="";
        boolean empty=name.isEmpty();
        boolean empty2=name2.isEmpty();
        System.out.println(empty);
        System.out.println(empty2);
        System.out.println("name.isEmpty() = " + name.isEmpty());
        System.out.println("name2.isEmpty() = " + name2.isEmpty());


        String word1="    Adilet love AizADA   ";
        String word2="adilet love aizada";
        System.out.println(word1.equals(word2));
        System.out.println(word1.equalsIgnoreCase(word2));

        System.out.println(word1.startsWith("adilet")); // false
        System.out.println(word1.toLowerCase().startsWith("adilet")); //true

        System.out.println(word1.endsWith("AizADA")); // true

        System.out.println(word1.replace('A','Z'));
        System.out.println(word1.trim());
        System.out.println(word1.substring(word1.length()-1));

    }
}
