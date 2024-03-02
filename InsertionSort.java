public class InsertionSort {

    public static void main(String[] args) {
        int [] my_array = {23,78,43,98,12,41,7};
        int n = my_array.length;
        for(int i = 1; i<n; i++){
            int insertIndex = i;
            int currentValue = my_array[i];
            int j = i-1;
            while(j>=0 &&  my_array[j] > currentValue){
                my_array[j+1] = my_array[j];
                insertIndex = j;
                j--;
            }
            my_array[insertIndex] = currentValue;

        }
        System.out.println("Sorted Array:");
        for(int value : my_array){
            System.out.println(value + " ");
        }
    }
}
