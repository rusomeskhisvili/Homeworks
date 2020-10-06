import java.util.Scanner;

public class C {
    private int a, b, c;

    public void Method1(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

    }
    public int Method2(){
        return Math.abs(a) % 10;
    }

    public char Method3(){
        return ("" + b).charAt(0);
    }
    public int Method4(){
        int Last;
        int sum = 0;

        while (c > 0){
            Last = c%10;
            sum = sum + Last;
            c = c/10;
        }
        return sum;
    }
    public int Method5(){
        return Method2()*(Method3()-48);
    }
    public int Method6(){
        return (Method3()-48) + Method5();
    }

}
