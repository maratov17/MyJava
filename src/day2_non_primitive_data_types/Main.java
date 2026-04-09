package day2_non_primitive_data_types;

public class Main {
    public static void main(String[] args) {
        String hello="Hello";
        String hi="World";
        String concated=hello+" "+hi;
        String testing=new String("Hello how are you?");

        int num=123;
        int num2=456;

        String result=concated+" "+num+" "+num2+ " "+testing;
        System.out.println(result);

        System.out.println(hello+" "+hi);
        System.out.println(concated);
    }
}
