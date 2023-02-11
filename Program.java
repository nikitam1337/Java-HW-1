import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.printf("Запущена программа вычисления n-ого треугольного числа.\n");
        int n = UserInput("Введите число n: ");
        int result = (n*(n+1))/2;
        PrintResult(result);
    }
    public static int UserInput(String message) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("%s", message);
        int i = iScanner.nextInt();
        iScanner.close();
        return i;
    }
    public static void PrintResult(int result) {
        System.out.printf("n-е треугольное число = %d", result);
    }
}