public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] my_array = {43,76,23,12,65,53};
        int n = my_array.length;
        
        for(int i = 0; i< n-1; i++){
            int min_index = i;
            for(int j = i+1 ;j <n ;j++){
                if(my_array[j] <my_array[min_index]){
                    min_index= j;
                }
            }
            int min_value = my_array[min_index];
            for(int k= min_index ; k>i; k--){
                my_array[k] = my_array[k-1];

            }
            my_array[i] = min_value;
        }
        System.err.println("sorted array:");
        for(int i = 0; i<n ;i++){
            System.err.println(my_array[i]+ " ");
        }
        System.err.println();
    } 
}
