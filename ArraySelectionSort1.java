public class ArraySelectionSort1 {
    public static void main(String[] args) {
        int [] my_array = {23,54,43,21,18,32};
        int n = my_array.length;
         for (int i=0; i< n; i++){
            int min_index = i;
            for(int j= i+1; j<n ;j++){
                if(my_array[j] < my_array[min_index]){
                    min_index = j;
                }
            }
            int temp = my_array[i];
            my_array[i] =my_array[min_index];
            my_array[min_index]= temp;
         }
         System.out.println("sorted array:"+ " ");
         for(int i =0; i<n ;i++){
            System.out.println(my_array[i]+ " ");
         }
         System.out.println();
    }
}
