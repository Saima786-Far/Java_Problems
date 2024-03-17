import java.util.Scanner;

public class Fun1 {

    public static int multiplyTwo(int a , int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int multi = multiplyTwo(a, b);
        System.out.println("Multiply two number : " + multi);

    }
}
