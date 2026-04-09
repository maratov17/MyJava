package day3_string_manipulation;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String word="CoDewIse";
        word=word.toLowerCase();
        System.out.println(word);

        String word1="codewise";
        word1=word1.toUpperCase();
        System.out.println(word1);


        String name="Adilet";
        char letter=name.charAt(0);
        char letter1=name.charAt(1);
        char letter2=name.charAt(2);
        char letter3=name.charAt(3);
        char letter4=name.charAt(4);
        char letter5=name.charAt(5);
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);

        String concat=name.concat(word1);
        System.out.println(concat);

        int index=name.indexOf("e");
        System.out.println(index);

        String text="hello my name is Adilet";
        System.out.println(text.contains("Adilet"));

    }

}
