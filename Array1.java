import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int number[] = new int[arr];

        //Input 
        for(int i = 0; i<number.length; i++){
            number[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        //Output
    for(int i = 0; i<number.length; i++){
        // System.out.println(number[i]);
        if (number[i] == x){
            System.out.println("Found at index: " + i);
        }
    }

     }
}
