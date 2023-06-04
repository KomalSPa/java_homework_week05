package Programe_01_Calculat;

public class Calculate {
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " = : " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " = : " + result);
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " = : " + result);
    }
    public void division(int a, int b) {
        int result = a / b;
        System.out.println("The division of " + a + " and " + b + " = : " + result);
    }
    public void calculateResult(int a, int b, char symbol) {
            if (symbol == '+') {
                addition(a, b);
            } else if (symbol == '-') {
                subtraction(a, b);
            } else if (symbol == '*') {
                multiplication(a, b);
            } else if (symbol == '/') {
                division(a, b);
            } else {
                System.out.println("Invalid symbol insert !"); //Warning msg for an invalid entry
            }
        }

    }