import java.util.Scanner;

class Numbers {
    int a;
    int b;
    int c;
    Scanner sc = new Scanner(System.in);
    public void scanA() {
        System.out.println("Write first number for calculations:");
        a = sc.nextInt();
    }
    public void scanB() {
        System.out.println("Write second number for calculations:");
        b = sc.nextInt();
    }
    public void scanC() {
        System.out.println("Write second number for calculations:");
        c = sc.nextInt();
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

class AdvancedMath {
    //Exponentiation
    public void exp(int a, int b) {
        double result = Math.pow(a, b);
        System.out.println("Result of exponentiation number " + a + " to the power of " + b + ": " + result);
    }
    //Square
    public void root(int a, int b) {
        double result = Math.pow(a, 1/b);
        System.out.println("Result of taking a " + b + " degree square root of a number " + a + ": " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        BasicMath math = new BasicMath();
        AdvancedMath mathAdv = new AdvancedMath();
        num.scanA();
        num.scanB();

        math.add(num.a, num.b);
        math.diff(num.a, num.b);
        math.multi(num.a, num.b);
        math.div(num.a, num.b);
        mathAdv.exp(num.a, num.b);
        mathAdv.root(num.a, num.b);
    }
}