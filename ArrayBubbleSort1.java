public class ArrayBubbleSort1 {
    public static void main(String[] args) {
        int [] my_array = {23,76,12,31,24,33};
        int n = my_array.length;
        for(int i =0; i< n-1; i++){
            boolean swapped = false;
            for(int j =0; j< n-i-1;j++){
                if(my_array[j] > my_array[j+1]){
                    int temp = my_array[j];
                    my_array[j] = my_array[j+1];
                    my_array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("sorted array: " );
        for(int i=0; i< n ; i++){
            System.out.println(my_array[i]+" ");
        }
        System.out.println();
    }
    
}
