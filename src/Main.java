import java.util.Scanner;

class Numbers {
    int a;
    int b;
    public void scanA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number for calculations:");
        a = sc.nextInt();
    }public void scanB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write second number for calculations:");
        b = sc.nextInt();
    }
}
public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.scanA();
        num.scanB();

        //Addition
        int sum = num.a + num.b;
        System.out.println("Result of sum numbers " + num.a + " and " + num.b + ": " + sum);
        //Difference
        int diff = num.a - num.b;
        System.out.println("Result of difference numbers " + num.a + " and " + num.b + ": " + diff);
        //Multiplication
        int multi = num.a * num.b;
        System.out.println("Result of multiplication numbers " + num.a + " and " + num.b + ": " + multi);
        //Division
        int div = num.a / num.b;
        System.out.println("Result of division numbers " + num.a + " and " + num.b + ": " + div);
    }
}