import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int done=1;
        while(done==1){
            System.out.println("Welcome to the calculator! \n You can operate with '+','-','*','/'.\n Give the input in the format 'number1 operator number2' ");
            double number1= sc.nextDouble();
            char op = sc.next().charAt(0);
            double number2= sc.nextDouble();
            switch (op) {
                case '+' -> add(number1, number2);
                case '-' -> sub(number1, number2);
                case '*' -> multiply(number1, number2);
                case '/' -> div(number1, number2);
                default -> System.out.println("Invalid operator");
            }
            System.out.println("press 1 if you want to continue else give 0 ");
            done = sc.nextInt();
        }
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void sub(double a, double b){
        System.out.println(a-b);
    }
    public static void multiply(double a, double b){
        System.out.println(a*b);
    }
    public static void div(double a, double b){
        if (b==0){
            System.out.println("Oops!! You can't divide number by a zero");
            throw new IllegalArgumentException("Number cannot be divided by zero!");
        }
        else{
            System.out.println(a/b);
        }


    }
}
