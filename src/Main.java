import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число для вычисления:");
        int num1 = s.nextInt();
        System.out.print("Введите математическую операцию('+' '-' '/' '*'):");
        String oper = s.next();
        System.out.print("Введите второе число для вычисления:");
        int num2 = s.nextInt();
        int result;

        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Неизвестная операция");
                result = 0;
                System.exit(1);
        }
        System.out.println("Результат:" + result);
    }


}
