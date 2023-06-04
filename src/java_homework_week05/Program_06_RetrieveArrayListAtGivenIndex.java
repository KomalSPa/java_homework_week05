package java_homework_week05;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_06_RetrieveArrayListAtGivenIndex {
//Write a Java program to retrieve an element (at a specified index) from a given array list

    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Mango");
        fruitsList.add("Strawberry");
        fruitsList.add("Pineapple");
        fruitsList.add("Grapes");
        fruitsList.add("Banana");
        fruitsList.add("Blueberries");
        fruitsList.add("Rasberries");
        fruitsList.add("Water Melon");
        System.out.println(fruitsList);
        Scanner v1 = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = v1.nextInt();
        if (index < fruitsList.size()) {
            System.out.println(fruitsList.get(index));
        } else {
            System.out.println("Invalid Index!!");
        }
        v1.close();
    }
}