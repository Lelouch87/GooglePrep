public class InsertionSort extends Sort {
    @Override
    void sort(int[] array) {
        System.out.println("----INSERTION SORT----");
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Original Array");
        printArray(array);

        int key, j , temp;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i -1;
            while (j >= 0 && key < array[j]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }

        System.out.println("Sorted Array");
        printArray(array);
    }
}
