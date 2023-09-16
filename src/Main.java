import java.util.Scanner;

class OperCheck {
    Scanner sc = new Scanner(System.in);
    Numbers num = new Numbers();
    BasicMath math = new BasicMath();
    AdvancedMath mathAdv = new AdvancedMath();
    public void OperList() {
        System.out.println("What do you want to do?");
        System.out.println("1. Add");
        System.out.println("2. Difference");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Root of number");
        System.out.println("7. Exit");
    }

    public void Check() {
        while (true) {
            OperList();
            System.out.println("Select from list: ");
            int userSel = sc.nextInt();
            if (userSel == 1) {
                num.scanA();
                num.scanB();
                math.add(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 2) {
                num.scanA();
                num.scanB();
                math.diff(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 3) {
                num.scanA();
                num.scanB();
                math.multi(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 4) {
                num.scanA();
                num.scanB();
                math.div(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 5) {
                num.scanA();
                num.scanB();
                mathAdv.exp(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 6) {
                num.scanA();
                num.scanB();
                mathAdv.root(num.a, num.b);
                NextOper();
                int nextOperation  = sc.nextInt();
                if(ret(nextOperation)) break;
            } else if (userSel == 7) {
                break;
            } else System.out.println("Write again.");
        }
    }
    public void NextOper() {
        System.out.println("Do you want to do next operation?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Select: ");
    }
    public boolean ret(int x) {
        if (x == 2) {
            return true;
        } else return false;
    }
}
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
    public void exp(float a, float b) {
        double result = Math.pow(a, b);
        System.out.println("Result of exponentiation number " + a + " to the power of " + b + ": " + result);
        //System.out.println(String.format("Result of exponentiation number %s to the power of %s: %s", a, b, result));
    }
    //Square
    public void root(int a, int b) {
        double result = Math.pow(a, 1/b);
        System.out.println("Result of taking a " + b + " degree square root of a number " + a + ": " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        OperCheck opCheck = new OperCheck();
        opCheck.Check();
    }
}