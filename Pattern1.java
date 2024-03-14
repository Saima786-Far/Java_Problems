public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i= 1; i<=n ;i++){
            //First Half
            for(int j =n ;j>=i; j--){
                System.out.print(" ");
            }
            //Second half
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            //Third Half
            for(int j=1; j<=n; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}
