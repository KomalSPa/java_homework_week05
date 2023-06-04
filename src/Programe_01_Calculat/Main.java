package Programe_01_Calculat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;
        Scanner v1 = new Scanner(System.in);
        do {
            System.out.println("Please enter First Number:");
            int a = v1.nextInt();
            System.out.println("Please enter Second Number:");
            int b = v1.nextInt();
            System.out.println("Please enter one of the Symbol +, -, *, / :");
            char symbol = v1.next().charAt(0);
            Calculate calculate = new Calculate();
            calculate.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter Y or N:"); // input wizard
            answer = v1.next().toLowerCase();
        } while (answer.startsWith("y"));
        v1.close();

    }
}
