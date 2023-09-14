import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number to calculations:");
        int a = sc.nextInt();
        System.out.println("Write second number to calculations:");
        int b = sc.nextInt();

        //Addition
        int sum = a + b;
        System.out.println("Result of sum numbers " + a + " and " + b + ": " + sum);
        //Difference
        int diff = a - b;
        System.out.println("Result of difference numbers " + a + " and " + b + ": " + diff);
        //Multiplication
        int multi = a * b;
        System.out.println("Result of multiplication numbers " + a + " and " + b + ": " + multi);
        //Division
        int div = a / b;
        System.out.println("Result of division numbers " + a + " and " + b + ": " + div);
    }
}