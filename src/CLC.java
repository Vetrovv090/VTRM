import java.util.Scanner;

public class CLC {
    public static void maim(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод числа A");
        int a = sc.nextInt();
        System.out.println("Ввод числа B");
        int b = sc.nextInt();
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);

        }
    }
}