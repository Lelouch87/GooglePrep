public class SelectionSort extends Sort{
    @Override
    public void sort(int[] array) {
        System.out.println("----INSERTION SORT----");
        System.out.println("Time Complexity: O(n)^2");
        System.out.println("Original Array");
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j+1] < array[minIndex]) {
                    minIndex = j+1;

                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println("Sorted Array");
        printArray(array);
    }

}
