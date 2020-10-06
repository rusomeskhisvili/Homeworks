import java.util.Scanner;

public class A {
    private int x;
    public A(){
        System.out.println("Hello!");
    }
    public void Method1(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }
    public int Method2(){
        return x + 12;
    }
    public String Method3(){
        if(x == 0){
            return "0";
        }
        else if (x%2==0){
            return "ლუწია";
        }
        else{
            return "კენტია";
        }
    }
}
