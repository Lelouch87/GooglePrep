public class BubbleSort extends Sort {
    public void sort(int[] array) {
        System.out.println("----BUBBLE SORT----");
        System.out.println("Time Complexity: O(n)^2");
        System.out.println("Original Array");
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        printArray(array);
    }
}

