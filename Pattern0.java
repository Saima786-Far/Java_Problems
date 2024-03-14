public class Pattern0 {
    public static void main(String[] args) {
        int n = 5;
        //Upper Half
        for(int i = 1; i<=n ;i++){
            //Ist Half
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //2nd Half
            int spaces= 2*(n-i);
            for(int j=1; j<=spaces; j++)
             {
                System.out.print(" ");
             }
             //3rd Half
             
            for(int j =1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        //Lower Half
        for(int i =n; i>=1;i--){
            //Ist Half
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //2nd Half
            int spaces= 2*(n-i);
            for(int j=1; j<=spaces; j++)
             {
                System.out.print(" ");
             }
             //3rd Half
             
            for(int j =1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();

    }
    
}
}
