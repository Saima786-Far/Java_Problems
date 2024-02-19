import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    int a;
    System.out.println("Saima Farheen");
    System.out.println("Enter age");
    try (Scanner s = new Scanner(System.in)) {
      a = s.nextInt();
    }
    System.out.println(a);
  }
} 