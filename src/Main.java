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

class BasicMath {
    //Addition
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Result of sum numbers " + a + " and " + b + ": " + result);
    }
    //Difference
    public void diff(int a, int b) {
        int result = a - b;
        System.out.println("Result of difference numbers " + a + " and " + b + ": " + result);
    }
    //Multiplication
    public void multi(int a, int b) {
        int result = a * b;
        System.out.println("Result of multiplication numbers " + a + " and " + b + ": " + result);
    }
    //Division
    public void div(int a, int b) {
        int result = a / b;
        System.out.println("Result of division numbers " + a + " and " + b + ": " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        BasicMath math = new BasicMath();
        num.scanA();
        num.scanB();

        math.add(num.a, num.b);
        math.diff(num.a, num.b);
        math.multi(num.a, num.b);
        math.div(num.a, num.b);
    }
}