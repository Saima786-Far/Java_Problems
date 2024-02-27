public class lowestValue {
    public static void main(String args[]) {
        int my_array[] = { 12, 6, 8, 12 };
        int minVal = my_array[0];
        for (int i : my_array) {
            if (i < minVal) {
                minVal = i;
            }
        }
        System.out.println("Lowest value:" + minVal);

    }

}

