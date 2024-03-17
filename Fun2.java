import java.util.Scanner;

public class Fun2 {
  public static void printFacto(int n) {
    if(n<0){
      System.out.println("Invalid Number");
      return;
    }
    int Fac = 1;
    for (int i = n; i >= 1; i--) {
      Fac = Fac * i;
    }

    System.out.println(Fac);
    return;// its not mand in here bcz alredy return type void
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFacto(n);

  }

}
//Function ko direct Call  karte hai 
//Method ko Class ke obj se call krte hai