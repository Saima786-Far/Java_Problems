public class ArrayBubbleSort {
    public static void main (String args[]){
        int[] my_array = {24,17,34,90,11,8};
        int n = my_array.length;
        for(int i = 0; i < n-1; i++){
            for(int j =0 ; j< n-i-1 ; j++){
               if( my_array[j] > my_array[j+1]){

                int temp = my_array[j];
                my_array[j] = my_array[j+1];
                my_array[j+1] = temp;
               } 
            }
        }
        System.out.println("Sorted Array: ");
        for (int i=0; i<n ;i++) {
            System.out.println(my_array[i] + " ");
            
        }
        System.out.println();
    }

    
}
