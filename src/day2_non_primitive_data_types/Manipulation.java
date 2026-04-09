package day2_non_primitive_data_types;

public class Manipulation {
    public static void main(String[] args) {
        String test1="abc";
        String test2="abc";
        String test3=new String("abc");

        System.out.println("test1==test2 -> " + (test2 == test1));
        System.out.println("test1==test3 -> " + (test3 == test1));

        boolean areTheyEqual=test1.equals(test3);
        System.out.println("test1==test3 -> " + (areTheyEqual));
    }
}
