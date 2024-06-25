
import java.util.Scanner;




public class Calcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод числа A");
        int a = sc.nextInt();
        System.out.println("Ввод операции ( + - * / )");
        char operation = sc.next().charAt(0);
        System.out.println("Ввод числа B");
        int b = sc.nextInt();
        char operation1;
        int number1, number2;
        int result, resualt1;


        if (operation == '+') {
            int result1 = a + b;
            System.out.println(a + "+" + b + "=" + result1);
        } else if (operation == '-') {
            int result1 = a - b;
            System.out.println(a + "-" + b + "=" + result1);
        } else if (operation == '*') {
            int result1 = a * b;
            System.out.println(a + "*" + b + "=" + result1);
        } else if (operation == '/') {
            int result1 = a / b;
            System.out.println(a + "/" + b + "=" + result1);
        } else {
            System.out.println("Чумба, эта прога не поддерживает операцию");
        }
        if (a + b == 2077) {
            System.out.println("https://www.youtube.com/watch?v=bN1tW2o23Qk&ab_channel=AmrRashad");
        }
    }

}
