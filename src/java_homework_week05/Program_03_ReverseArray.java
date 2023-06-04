package java_homework_week05;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  Write a Java program to reverse an array of integer values.
 */
public class Program_03_ReverseArray {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println("Number Before Reverse : " + list );
        Collections.reverse(list);
        System.out.println("Number After Reverse : " + list);

    }
}